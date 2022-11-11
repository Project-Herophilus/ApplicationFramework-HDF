package io.connectedhealth_idaas.imoterms;

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
public class IMOTermsRouteBuilder extends RouteBuilder {


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

    @Override
    public void configure() throws Exception {

        /*
         *  File Processing
         */
        /*from("file://data-input/cloud/")
                .routeId("test_fileinput_cloud")
                // set Auditing Properties
                .to(getKafkaTopicUri("{{idaas.cloudTopic}}"))
        ;*/




        // Kafka Topic
        from(getKafkaTopicUri("{{idaas.cloudTopic}}"))
        ;

    }
}
