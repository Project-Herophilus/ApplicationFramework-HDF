package io.connectedhealth_idaas.cloud;

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
public class CamelConfiguration extends RouteBuilder {


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
    private String getAWSConfig(String awsInput)
    {
        String awsSecuritySettings= awsInput+"accessKey=RAW("+config.getAwsAccessKey()+")&secretKey=RAW("+config.getAwsSecretKey()+")";
        return awsSecuritySettings;
    }

    @Override
    public void configure() throws Exception {

        // Servlet
        from("servlet://test_publiccloud")
                .routeId("test_http_cloud")
                // set Auditing Properties
                .convertBodyTo(String.class).to(getKafkaTopicUri("{{idaas.test_cloudTopic}}"))
        ;
        /*
         *  File Processing
         */
        from("file://data-input/cloud/")
                .routeId("test_fileinput_cloud")
                // set Auditing Properties
                .to(getKafkaTopicUri("{{idaas.cloudTopic}}"))
        ;

        /*
         *  Core Outbound Cloud Processing
         *
         */
        from("servlet://publiccloud")
                .routeId("http_cloud")
                // Send To Topic
                .convertBodyTo(String.class).to(getKafkaTopicUri("{{idaas.cloudTopic}}"))
        ;
        // Kafka Topic
        from(getKafkaTopicUri("{{idaas.cloudTopic}}"))
                .routeId("Cloud-Kafka-Topic")
                // Send To S3
                // S3 Specifics
                .choice().when(simple("{{idaas.awsS3}}"))
                .setHeader(S3Constants.KEY, simple("${exchangeId}"+".dat"))
                .to("aws2-s3://testhealthcarebucket")
                //.wireTap("direct:logging")
                // Send to AMQ
                .choice().when(simple("{{idaas.awsMQ}}"))
                //.to(ExchangePattern.InOnly, "amqp:topic:myHealthcareTopic?connectionFactory=#jmsConnectionFactory")
                .to(ExchangePattern.InOnly, "amqp:queue:myHealthcareQueue?connectionFactory=#jmsConnectionFactory")
                // Send to SQS
                .choice().when(simple("{{idaas.awsSQS}}"))
                // SQS Specifics
                .to("aws2-sqs://testhealthcare")
                // Send to SNS
                .choice().when(simple("{{idaas.awsSNS}}"))
                // SNS Specifics
                .setHeader(SnsConstants.SUBJECT,simple("iOT Data Received"))
                .setHeader(SnsConstants.MESSAGE_ID,simple("${exchangeId}"))
                .to(getAWSConfig("aws2-sns://TestSNS?"))
                // Send to SES
                .choice().when(simple("{{idaas.awsSES}}"))
                // SES
                .setHeader(SesConstants.SUBJECT, simple("New Published Data to AWS for iDaaS-Connect-Cloud"))
                .setHeader(SesConstants.TO, constant(Collections.singletonList("alscott@redhat.com")))
                .setBody(simple("Data was received on ${date:now:yyyy-MM-dd} at ${date:now:HH:mm:ss:SSS}."))
                .to("aws2-ses://alscott@redhat.com?")
                // Send to Kinesis
                .choice().when(simple("{{idaas.awsKinesis}}"))
                // Kinesis
                .setHeader(KinesisConstants.PARTITION_KEY,simple("Shard1"))
                //.to(getAWSConfig("aws2-kinesis://testhealthcarekinesisstream?"))
                .to("aws2-kinesis://testhealthcarekinesisstream?exchangePattern=InOnly")
                .endChoice()
        ;

    }
}
