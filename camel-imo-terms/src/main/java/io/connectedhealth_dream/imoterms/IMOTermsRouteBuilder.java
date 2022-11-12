package io.connectedhealth_dream.imoterms;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.Exchange;
import org.springframework.http.MediaType;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


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
    public static final String DATATIER_ROUTE_ID = "datatier-direct";
    public static final String HEDA_ROUTE_ID = "heda-direct";
    public static final String PUBLICCLOUD_ROUTE_ID = "publiccloud-direct";
    public static final String IMOTERMSAPI_ROUTE_ID = "imo-api-inbound";
    public static final String IMOTERMS_ROUTE_ID = "imo-kafka-inbound";

    @Override
    public void configure() throws Exception {

        onException(Exception.class)
                .handled(true)
                .log(LoggingLevel.ERROR,"${exception}")
                .to("micrometer:counter:imoterms_exception_handled");
        /*
         *   Direct Internal Processing
         */
        from("direct:terminologies")
                .choice()
                .when(simple("{{idaas.process.Terminologies}}"))
                //.routeId("iDaaS-Terminologies")
                //.convertBodyTo(String.class).to("kafka:{{idaas.terminologyTopic}}?brokers={{idaas.kafkaBrokers}}");
                .routeId(TERMINOLOGY_ROUTE_ID)
                .to("log:" + TERMINOLOGY_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:terminologyTransactions")
                //  Invoke API
                // .to("kafka:{{idaas.terminology.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .endChoice();

        from("direct:datatier")
                .choice()
                .when(simple("{{idaas.process.DataTier}}"))
                .routeId(DATATIER_ROUTE_ID)
                .to("log:" + DATATIER_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:datatierTransactions")
                .to("kafka:{{idaas.datatier.topic.name}}?brokers={{idaas.kafka.brokers}}")
                // to the deidentification API
                .endChoice();

        from("direct:heda")
                .choice()
                .when(simple("{{idaas.process.HEDA}}"))
                .routeId(HEDA_ROUTE_ID)
                .to("log:" + HEDA_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:hedaTransactions")
                .to("kafka:{{idaas.heda.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .endChoice();

        from("direct:publiccloud")
                .choice()
                .when(simple("{{idaas.process.PublicCloud}}"))
                .routeId(PUBLICCLOUD_ROUTE_ID)
                .to("log:" + PUBLICCLOUD_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:publiccloudTransactions")
                .to("kafka:{{idaas.publiccloud.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .endChoice();

        /*
         *   Rest EndPoints
         */
        restConfiguration()
                .component("servlet");

        rest("/imoterms")
                .post()
                .produces(MediaType.TEXT_PLAIN_VALUE)
                .route()
                .routeId(IMOTERMSAPI_ROUTE_ID)
                .to("log:" + IMOTERMSAPI_ROUTE_ID + "?showAll=true")
                .log("${exchangeId} fully processed")
                .to("micrometer:counter:imotermsAPIPostedTransactions")
                .to("kafka:{{idaas.terminology.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .multicast().parallelProcessing()
                // Process Terminologies
                    .to("direct:terminologies")
                .end()
        .endRest();

        // Kafka
        from("kafka:{{idaas.terminology.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .routeId(IMOTERMS_ROUTE_ID)
                .to("log:" + IMOTERMS_ROUTE_ID + "?showAll=true")
                .log("${exchangeId} fully processed")
                .to("micrometer:counter:imoTermKafkaProcessTransactions")
                // This is to ensure that processes can run independently and if they transform data
                // it will not mess with any other processes
                .multicast().parallelProcessing()
                // Process Terminologies
                .to("direct:terminologies")
                .end();


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
