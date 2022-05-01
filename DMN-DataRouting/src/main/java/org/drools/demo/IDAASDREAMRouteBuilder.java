package org.drools.demo;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.model.ClaimCheckOperation;

import io.connectedhealth_idaas.eventbuilder.parsers.clinical.HL7RoutingEventParser;
import utils.camel3.DMNResultDecisionsToHeadersProcessor;
import utils.camel3.KogitoProcessorFactory;

@ApplicationScoped
public class IDAASDREAMRouteBuilder extends RouteBuilder {

    @Inject
    KogitoProcessorFactory kogitoProcessor;

    static final Processor bodyToMap = (Exchange e) -> e.getIn().setBody(Map.of("event", e.getIn().getBody()));
    static final Processor decisionsToHeaders = DMNResultDecisionsToHeadersProcessor.builder("topicsHeader", "topic names").build();
    Processor kogitoDMNEvaluate;
    
    @PostConstruct
    public void init() {
        kogitoDMNEvaluate = kogitoProcessor.decisionProcessor("ns1", "RoutingEvent");
    }

    @Override
    public void configure() throws Exception {
        from("direct:hl7")
            .bean(HL7RoutingEventParser.class, "buildRoutingEvent(${body})")
            .claimCheck(ClaimCheckOperation.Push)
                .process(bodyToMap)
                .process(kogitoDMNEvaluate) // <-- Rules as DMN decisions to decide which Kakfa topic queue to be sent to.
                .process(decisionsToHeaders)
            .claimCheck(ClaimCheckOperation.Pop)
            .to("log:org.drools.demo?level=DEBUG&showAll=true&multiline=true")
            .transform().simple("${body.messageData}")
            .choice()
            .when(simple("${header.topicsHeader.size} > 0"))
                .loop(simple("${header.topicsHeader.size}"))
                    .setHeader(KafkaConstants.OVERRIDE_TOPIC, 
                        simple("${header.topicsHeader[${exchangeProperty.CamelLoopIndex}]}"))
                    .to("kafka:default")
                .endChoice()
            .otherwise()
                .to("kafka:CATCH_ALL")
            ;
    }
}
