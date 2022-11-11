package io.connectedhealth_idaas.imoterms;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.ExchangePattern;
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
    // Public Variables
    public static final String TERMINOLOGY_ROUTE_ID = "terminologies-direct";
    public static final String DEIDENTIFICATION_ROUTE_ID = "deidentification-direct";
    public static final String EMPI_ROUTE_ID = "empi-direct";
    public static final String DATATIER_ROUTE_ID = "datatier-direct";
    public static final String HEDA_ROUTE_ID = "heda-direct";
    public static final String PUBLICCLOUD_ROUTE_ID = "publiccloud-direct";
    public static final String SDOH_ROUTE_ID = "sdoh-direct";

    @Override
    public void configure() throws Exception {

        onException(Exception.class)
                .handled(true)
                .log(LoggingLevel.ERROR,"${exception}")
                .to("micrometer:counter:terminology_exception_handled")
                .setHeader(Exchange.CONTENT_TYPE, constant(MediaType.TEXT_PLAIN_VALUE))
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(500))
                .setBody(simple("${exception}"));
        /*
         *   Direct Internal Processing
         */
        from("direct:terminologies")
                .choice()
                .when(simple("{{idaas.process.Terminologies}}"))
                .routeId(TERMINOLOGY_ROUTE_ID)
                .to("log:" + TERMINOLOGY_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:terminologyTransactions")
                // Partner REST API Integration
                // .to("kafka:{{idaas.iot.integration.topic}}?brokers={{idaas.kafka.brokers}}")
        .endChoice();

        // Kafka Topic
        from("kafka:{{idaas.terminology.topic.name}}?brokers={{idaas.kafka.brokers}}")
                // Aspects of platform invocation
                .to("direct:terminologies")
        ;

        // Rest APIs
        restConfiguration()
                .component("servlet");

        rest("/imo-terms")
                .post()
                .produces(MediaType.TEXT_PLAIN_VALUE)
                .route()
                .routeId(IOT_ROUTE_ID)
                .to("log:"+ IOT_ROUTE_ID + "?showAll=true")
                .log("${exchangeId} fully processed")
                .to("micrometer:counter:imoterminologyEventReceived")
                .to("direct:terminologies")
                .endRest();

        /*
         *  File Processing
         */
        /*from("file://data-input/cloud/")
                .routeId("test_fileinput_cloud")
                // set Auditing Properties
                .to(getKafkaTopicUri("{{idaas.cloudTopic}}"))
        ;*/



    }
}
