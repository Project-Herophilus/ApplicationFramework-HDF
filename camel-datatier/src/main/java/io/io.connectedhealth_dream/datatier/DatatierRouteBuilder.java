package io.connectedhealth_dream.datatier;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DatatierRouteBuilder extends RouteBuilder {
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
    public static final String DATATIERPERSIST_ROUTE_ID = "datatierpersist-direct";
    public static final String DATATIERPERSIST2_ROUTE_ID = "datatierpersist-findby-direct";
    public static final String DEIDENTIFICATION_ROUTE_ID = "deidentification-direct";
    public static final String EMPI_ROUTE_ID = "empi-direct";
    public static final String HEDA_ROUTE_ID = "heda-direct";
    public static final String PUBLICCLOUD_ROUTE_ID = "publiccloud-direct";
    public static final String SDOH_ROUTE_ID = "sdoh-direct";
    public static final String KAFKA_ROUTE_ID = "datatier-kafka";
    @Override
    public void configure() throws Exception {

/*
        onException(Exception.class)
                .log(LoggingLevel.ERROR,"${exception}")
                .to("micrometer:counter:sftp_exception_handled");

*/
        onException(Exception.class)
                .handled(true)
                .log(LoggingLevel.ERROR,"${exception}")
                .to("micrometer:counter:mongoDB_exception_handled")
                .setHeader(Exchange.CONTENT_TYPE, constant(MediaType.TEXT_PLAIN_VALUE))
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(500))
                .setBody(simple("${exception}"));

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
                .to("kafka:{{idaas.terminology.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .endChoice();

        from("direct:datatierpersist")
                .choice()
                .routeId(DATATIERPERSIST_ROUTE_ID)
                .to("log:" + DATATIERPERSIST_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .when(simple("{{idass.persist.DataBricks}}"))
                    .to("micrometer:counter:datatierpersist_DataBricks_Transactions")
                .when(simple("{{idass.persist.MongoDB}}"))
                    .to("micrometer:counter:datatierpersist_MongoDB_Transactions")
                    .to("mongodb:{{datatier.mongodb}}"+"&operation=insert")
                    .setBody(simple("${body}"))
                .when(simple("{{idass.persist.SnowFlake}}"))
                    .to("micrometer:counter:datatierpersist_SnowFlake_Transactions")
                .endChoice();

        from("direct:datatierpersist-findby")
                .choice()
                .routeId(DATATIERPERSIST2_ROUTE_ID)
                .to("log:" + DATATIERPERSIST2_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .when(simple("{{idass.persist.DataBricks}}"))
                    .to("micrometer:counter:datatierpersistfindby_DataBricks_Transactions")
                .when(simple("{{idass.persist.MongoDB}}"))
                    .to("micrometer:counter:datatierpersistfindby_MongoDB_Transactions")
                    .to("mongodb:{{datatier.mongodb}}"+"&operation=findById")
                .setBody(simple("${body}"))
                .when(simple("{{idass.persist.SnowFlake}}"))
                    .to("micrometer:counter:datatierpersistfindby_SnowFlake_Transactions")
                .endChoice();

        from("direct:deidentification")
                .choice()
                .when(simple("{{idaas.process.Deidentification}}"))
                .routeId(DEIDENTIFICATION_ROUTE_ID)
                .to("log:" + DEIDENTIFICATION_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:deidentificationTransactions")
                .to("kafka:{{idaas.deidentification.topic.name}}?brokers={{idaas.kafka.brokers}}")
                // to the deidentification API
                .endChoice();

        from("direct:empi")
                .choice()
                .when(simple("{{idaas.process.Empi}}"))
                .routeId(EMPI_ROUTE_ID)
                .to("log:" + EMPI_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:deidentificationTransactions")
                .to("kafka:{{idaas.deidentification.topic.name}}?brokers={{idaas.kafka.brokers}}")
                // to the empi API
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

        from("direct:sdoh")
                .choice()
                .when(simple("{{idaas.process.Sdoh}}"))
                .routeId(SDOH_ROUTE_ID)
                .to("log:" + SDOH_ROUTE_ID + "?showAll=true")
                //.log("${exchangeId} fully processed")
                .to("micrometer:counter:sdohTransactions")
                .to("kafka:{{idaas.sdoh.topic.name}}?brokers={{idaas.kafka.brokers}}")
                .endChoice();


        from("kafka:{{idaas.datatier.topic.name}}?brokers={{idaas.kafka.brokers}}")
            .routeId(KAFKA_ROUTE_ID)
            .to("log:" + KAFKA_ROUTE_ID + "?showAll=true")
            .log("${exchangeId} fully processed")
            .to("micrometer:counter:datatier_KafkaTransactions")
            .multicast().parallelProcessing()
                // Process Terminologies
                .to("direct:terminologies")
                // Deidentification
                .to("direct:deidentification")
                // EMPI
                .to("direct:empi")
                // HEDA
                .to("direct:heda")
                // Public Cloud
                .to("direct:publiccloud")
                // SDOH
                .to("direct:sdoh")
                // Persist
                .to("direct:datatierpersist");

        /*
         *  From to pull data from topics
         */
        restConfiguration()
                .component("servlet");

        rest("/mongodb")
            .get("/findRecord")
                .produces(MediaType.APPLICATION_JSON_VALUE)
                .route()
                .routeId("MongoDB-FindRecord")
                .to("log: MongoDB-FindRecord?showAll=true")
                .to("micrometer:counter:mongodb-findrecord")
                .to("direct:datatierpersist-findby")
            .endRest()
            .get("/persistRecord")
                .produces(MediaType.APPLICATION_JSON_VALUE)
                .route()
                .routeId("MongoDB-PersistRecord")
                .to("log: MongoDB-PersistRecord?showAll=true")
                .to("micrometer:counter:mongodb-persistrecord")
                .to("direct:datatierpersist")
        .end();

   }
}
