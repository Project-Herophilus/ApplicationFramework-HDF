package io.connectedhealth_dream.cloud;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.ExchangePattern;
import org.apache.camel.component.aws.kinesis.KinesisConstants;
import org.apache.camel.component.aws.s3.S3Constants;
import org.apache.camel.component.aws.ses.SesConstants;
import org.apache.camel.component.aws.sns.SnsConstants;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.Collections;

/*
 *  Apache Camel Connectors Can Be found here
 *
 */
@Component
public class PublicCloudRouteBuilder extends RouteBuilder {


    @Bean
    ServletRegistrationBean camelServlet() {
        // use a @Bean to register the Camel servlet which we need to do
        // because we want to use the camel-servlet component for the Camel REST service
        ServletRegistrationBean mapping = new ServletRegistrationBean();
        mapping.setName("CamelServlet");
        mapping.setLoadOnStartup(1);
        mapping.setServlet(new CamelHttpTransportServlet());
        mapping.addUrlMappings("/idaas/*");
        return mapping;
    }
   /*private String getAWSConfig(String awsInput)
    {
        String awsSecuritySettings= awsInput+"accessKey=RAW("+config.getAwsAccessKey()+")&secretKey=RAW("+config.getAwsSecretKey()+")";
        //String awsSecuritySettings= awsInput+"accessKey=RAW("{{awsAccessKey}}+")&secretKey=RAW("+ {{awsSecretKey}}";
        return awsSecuritySettings;
    }*/

    @Override
    public void configure() throws Exception {

        // Servlet
        from("servlet://test_publiccloud")
                .routeId("test_http_cloud")
                // set Auditing Properties
                .to("kafka:{{idaas.test_cloud.topic.name}}?brokers={{idaas.kafka.brokers}}")
        ;

        from("servlet://publiccloud")
                .routeId("http_cloud")
                // Send To Topic
                .to("kafka:{{idaas.cloud.topic.name}}?brokers={{idaas.kafka.brokers}}")
        ;

        // Kafka Topic
        from("kafka:{{idaas.cloud.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .routeId("Cloud-Kafka-Topic")
                // Send To S3
                // S3 Specifics
                .choice().when(simple("{{idaas.awsS3}}"))
                    .setHeader(S3Constants.KEY, simple("${exchangeId}"+".dat"))
                    //.to("aws-s3://public-idaas?accessKey={{aws.access.key}}&secretKey={{aws.secret.key}}&region={{aws.region}}&operation=listObjects")
                    .to("aws2-s3://{{bucket.name}}?accessKey={{aws.access.key}}&secretKey={{aws.secret.key}}&region={{aws.region}}&operation=listObjects")
                // Send to SQS
                .choice().when(simple("{{idaas.awsSQS}}?accessKey={{aws.access.key}}&secretKey={{aws.secret.key}}&region={{aws.region}}"))
                    // SQS Specifics
                    .to("aws2-sqs://testhealthcare")
                // Send to SNS
                .choice().when(simple("{{idaas.awsSNS}}?accessKey={{aws.access.key}}&secretKey={{aws.secret.key}}&region={{aws.region}}"))
                    .setHeader(SnsConstants.SUBJECT,simple("iOT Data Received"))
                    .setHeader(SnsConstants.MESSAGE_ID,simple("${exchangeId}"))
                    .to("aws2-sns://TestSNS?")
                // Send to SES
                .choice().when(simple("{{idaas.awsSES}}?accessKey={{aws.access.key}}&secretKey={{aws.secret.key}}&region={{aws.region}}"))
                    .setHeader(SesConstants.SUBJECT, simple("New Published Data to AWS for iDaaS-Connect-Cloud"))
                    .setHeader(SesConstants.TO, constant(Collections.singletonList("alscott@redhat.com")))
                    .setBody(simple("Data was received on ${date:now:yyyy-MM-dd} at ${date:now:HH:mm:ss:SSS}."))
                    .to("aws2-ses://alscott@redhat.com?")
                // Send to Kinesis
                .choice().when(simple("{{idaas.awsKinesis}}?accessKey={{aws.access.key}}&secretKey={{aws.secret.key}}&region={{aws.region}}"))
                    .setHeader(KinesisConstants.PARTITION_KEY,simple("Shard1"))
                    //.to(getAWSConfig("aws2-kinesis://testhealthcarekinesisstream?"))
                    .to("aws2-kinesis://testhealthcarekinesisstream?exchangePattern=InOnly")
                // Send to AMQ
                //.choice().when(simple("{{idaas.awsMQ}}"))
                //.to(ExchangePattern.InOnly, "amqp:topic:myHealthcareTopic?connectionFactory=#jmsConnectionFactory")
                //.to(ExchangePattern.InOnly, "amqp:queue:myHealthcareQueue?connectionFactory=#jmsConnectionFactory")
                .endChoice()
        ;

    }
}
