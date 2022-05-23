/*
 * Copyright 2019 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package io.connectedhealth_idaas.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaComponent;
import org.apache.camel.component.kafka.KafkaEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.connection.JmsTransactionManager;
//import javax.jms.ConnectionFactory;
import org.springframework.stereotype.Component;

@Component
public class CamelConfiguration extends RouteBuilder {
    private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);

    @Autowired
    private ConfigProperties config;

    @Bean
    private KafkaEndpoint kafkaEndpoint() {
        KafkaEndpoint kafkaEndpoint = new KafkaEndpoint();
        return kafkaEndpoint;
    }

    @Bean
    private KafkaComponent kafkaComponent(KafkaEndpoint kafkaEndpoint) {
        KafkaComponent kafka = new KafkaComponent();
        return kafka;
    }

    private String getKafkaTopicUri(String topic) {
        return "kafka:" + topic +
                "?brokers=" +
                config.getKafkaBrokers();
    }

    /*
     * Kafka implementation based upon https://camel.apache.org/components/latest/kafka-component.html
     *
     */
    @Override
    public void configure() throws Exception {

        /*
         *   HIDN
         *   HIDN - Health information Data Network
         *   Intended to enable simple movement of data aside from specific standards
         *   Common Use Cases are areas to support remote (iOT/Edge) and any other need for small footprints to larger
         *   footprints
         * : Unstructured data, st
         */
        from("direct:hidn")
                .setHeader("messageprocesseddate").simple("${date:now:yyyy-MM-dd}")
                .setHeader("messageprocessedtime").simple("${date:now:HH:mm:ss:SSS}")
                .setHeader("eventdate").simple("eventdate")
                .setHeader("eventtime").simple("eventtime")
                .setHeader("processingtype").exchangeProperty("processingtype")
                .setHeader("industrystd").exchangeProperty("industrystd")
                .setHeader("component").exchangeProperty("componentname")
                .setHeader("processname").exchangeProperty("processname")
                .setHeader("organization").exchangeProperty("organization")
                .setHeader("careentity").exchangeProperty("careentity")
                .setHeader("customattribute1").exchangeProperty("customattribute1")
                .setHeader("customattribute2").exchangeProperty("customattribute2")
                .setHeader("customattribute3").exchangeProperty("customattribute3")
                .setHeader("camelID").exchangeProperty("camelID")
                .setHeader("exchangeID").exchangeProperty("exchangeID")
                .setHeader("internalMsgID").exchangeProperty("internalMsgID")
                .setHeader("bodyData").exchangeProperty("bodyData")
                .setHeader("bodySize").exchangeProperty("bodySize")
                .convertBodyTo(String.class).to(getKafkaTopicUri("hidn"))
        ;
        /*
         * Audit
         *
         * Direct component within platform to ensure we can centralize logic
         * There are some values we will need to set within every route
         * We are doing this to ensure we dont need to build a series of beans
         * and we keep the processing as lightweight as possible
         *
         */
        from("direct:auditing")
                .setHeader("messageprocesseddate").simple("${date:now:yyyy-MM-dd}")
                .setHeader("messageprocessedtime").simple("${date:now:HH:mm:ss:SSS}")
                .setHeader("processingtype").exchangeProperty("processingtype")
                .setHeader("industrystd").exchangeProperty("industrystd")
                .setHeader("component").exchangeProperty("componentname")
                .setHeader("messagetrigger").exchangeProperty("messagetrigger")
                .setHeader("processname").exchangeProperty("processname")
                .setHeader("auditdetails").exchangeProperty("auditdetails")
                .setHeader("camelID").exchangeProperty("camelID")
                .setHeader("exchangeID").exchangeProperty("exchangeID")
                .setHeader("internalMsgID").exchangeProperty("internalMsgID")
                .setHeader("bodyData").exchangeProperty("bodyData")
                //.convertBodyTo(String.class).to("kafka://localhost:9092?topic=opsMgmt_PlatformTransactions&brokers=localhost:9092")
                .convertBodyTo(String.class).to(getKafkaTopicUri("opsmgmt_platformtransactions"))
        ;
        /*
         *  Logging
         */
        from("direct:logging")
                .log(LoggingLevel.INFO, log, "Transaction Message: [${body}]")
        ;

        /*
         *   General iDaaS Platform
         */
        from("servlet://hidn")
                .routeId("HIDN")
                // Data Parsing and Conversions
                // Normal Processing
                .convertBodyTo(String.class)
                .setHeader("messageprocesseddate").simple("${date:now:yyyy-MM-dd}")
                .setHeader("messageprocessedtime").simple("${date:now:HH:mm:ss:SSS}")
                .setHeader("eventdate").simple("eventdate")
                .setHeader("eventtime").simple("eventtime")
                .setHeader("processingtype").exchangeProperty("processingtype")
                .setHeader("industrystd").exchangeProperty("industrystd")
                .setHeader("component").exchangeProperty("componentname")
                .setHeader("processname").exchangeProperty("processname")
                .setHeader("organization").exchangeProperty("organization")
                .setHeader("careentity").exchangeProperty("careentity")
                .setHeader("customattribute1").exchangeProperty("customattribute1")
                .setHeader("customattribute2").exchangeProperty("customattribute2")
                .setHeader("customattribute3").exchangeProperty("customattribute3")
                .setHeader("camelID").exchangeProperty("camelID")
                .setHeader("exchangeID").exchangeProperty("exchangeID")
                .setHeader("internalMsgID").exchangeProperty("internalMsgID")
                .setHeader("bodyData").exchangeProperty("bodyData")
                .setHeader("bodySize").exchangeProperty("bodySize")
                .wireTap("direct:hidn")
        ;
        /*
         *   Simple language reference
         *   https://camel.apache.org/components/latest/languages/simple-language.html
         */
        /*
         *   Middle Tier
         *   Move Transactions and enable the Clinical Data Enterprise Integration Pattern
         *   HL7 v2
         *   1. to Sending App By Message Type
         *   2. to Facility By Message Type
         *   3. to Enterprise by Message Type
         *   FHIR
         *   1. to Enterprise by Message Type
         */

        /*
         *    HL7v2 ADT
         */
        from(getKafkaTopicUri("mctn_mms_adt"))
                .routeId("ADT-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ADT")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ADT to Enterprise By Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_adt"))
                //.to("kafka:localhost:9092?topic=mms_adt&brokers=localhost:9092")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ADT")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ADT to Facility By Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_adt"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ADT")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ADT to Enterprise By Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_adt"))
        ;

        /*
         *   HL7v2 ORM
         */
        from(getKafkaTopicUri("mctn_mms_orm"))
                .routeId("ORM-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ORM")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ORM to Enterprise Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_orm"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ORM")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ORM to Facility By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_orm"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ORM")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ADT to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_orm"))
        ;

        /*
         *   HL7v2 ORU
         */
        from(getKafkaTopicUri("mctn_mms_oru"))
                .routeId("ORU-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ORU")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ORU to Enterprise Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_oru"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ORU")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ORU Facility By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_oru"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ORU")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ORU to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Entrprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_oru"))
        ;

        /*
         *   HL7v2 SCH
         */
        from(getKafkaTopicUri("mctn_mms_sch"))
                .routeId("SCH-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("SCH")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("SCH to Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_sch"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("SCH")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("SCH Facility By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_sch"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("SCH")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("SCH to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_sch"))
        ;

        /*
         *   HL7v2 RDE
         */
        from(getKafkaTopicUri("mctn_mms_rde"))
                .routeId("RDE-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("RDE")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("RDE Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_rde"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("RDE")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("RDE Facility By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_orm"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("RDE")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("RDE Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_rde"))
        ;

        /*
         *   HL7v2 MDM
         */
        from(getKafkaTopicUri("mctn_mms_mdm"))
                .routeId("MDM-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("MDM")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MDM Sending App By Data Type middle tier")
                // iDAAS DataHub Processing
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_mdm"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("MDM")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MDM Facility By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_mdm"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("MDM")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MDM to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_mdm"))
        ;

        /*
         *   HL7v2 MFN
         */
        from(getKafkaTopicUri("mctn_mms_mfn"))
                .routeId("MFN-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("MFN")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MFN Sending App By Data Type middle tier")
                // iDAAS DataHub Processing
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_mfn"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("MFN")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MFN Facility By Data Type middle tier")
                // iDAAS DataHub Processing
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_mfn"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("MFN")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ADT to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_mfn"))
        ;

        /*
         *   HL7v2 VXU
         */
        from(getKafkaTopicUri("mctn_mms_vxu"))
                .routeId("VXU-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("VXU")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("VXU Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Sending App By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mms_vxu"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("VXU")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("VXU By Sending App By Data Type middle tier")
                .wireTap("direct:auditing")
                // Facility By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("mctn_vxu"))
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("VXU")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("VXU Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_vxu"))
        ;

        /*
         *   FHIR
         */
        // Adverse Events
        from(getKafkaTopicUri("fhirsvr_adverseevent"))
                //from("kafka:fhirsvr_AdverseEvent?brokers=localhost:9092")
                .routeId("AdverseEvent-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("AdverseEvent")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Adverse Event to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_adverseevent"))
        ;

        // Allergy Intollerance
        from(getKafkaTopicUri("fhirsvr_allergyintollerance"))
                .routeId("AllergyIntollerance-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("AllergyIntollerance")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Allergy Intollerance to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_allergyintollerance"))
        ;

        // Appointment
        from(getKafkaTopicUri("fhirsvr_appointment"))
                .routeId("Appointment-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Appointment")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Appointment to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_appointment"))
        ;

        // Appointment Response
        from(getKafkaTopicUri("fhirsvr_appointmentresponse"))
                .routeId("AppointmentReesponse-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("AppointmentResponse")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Appointment Response to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_appointmentresponse"))
        ;

        //Care Plan
        from(getKafkaTopicUri("fhirsvr_careplan"))
                .routeId("CarePlan-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("CarePlan")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Care Plan to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to("kafka:localhost:9092?topic=ent_fhirsvr_careplan&brokers=localhost:9092")
        ;
        from("kafka:localhost:9092?topic=fhirsvr_CareTeam&brokers=localhost:9092")
                .routeId("CareTeam-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("CareTeam")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("CareTeam to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to("kafka:localhost:9092?topic=ent_fhirsvr_CareTeam&brokers=localhost:9092")
        ;
        from("kafka:localhost:9092?topic=fhirsvr_ClinicalImpression&brokers=localhost:9092")
                .routeId("ClinicalImpression-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ClincalImpression")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Clinical Impression to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_careplan"))
        ;
        from(getKafkaTopicUri("fhirsvr_communication"))
                .routeId("Communication-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Communication")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Communication to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_communication"))
        ;
        from(getKafkaTopicUri("fhirsvr_communicationresponse"))
                .routeId("CommunicationResponse-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("CommunicationResponse")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Communication Response to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_communicationresponse"))
        ;
        from(getKafkaTopicUri("fhirsvr_condition"))
                .routeId("Condition-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Condition")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Condition to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_condition"))
        ;
        from(getKafkaTopicUri("fhirsvr_consent"))
                .routeId("Consent-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Consent")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Consent to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("fhirsvr_consent"))
        ;
        from(getKafkaTopicUri("fhirsvr_detectedissue"))
                .routeId("DetectedIssue-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("DetectedIssue")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("DetectedIssue to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_detectedissue"))
        ;
        from(getKafkaTopicUri("fhirsvr_device"))
                .routeId("Device-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Device")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Device to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_device"))
        ;
        from(getKafkaTopicUri("fhirsvr_devicerequest"))
                .routeId("DeviceRequest-MiddleTier")
                // set Auditing Properties
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("DeviceRequest")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("DeviceRequest to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_devicerequest"))
        ;
        from(getKafkaTopicUri("fhirsvr_deviceusestatement"))
                .routeId("DeviceUseStatement-MiddleTier")
                // set Auditing Properties
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("DeviceUseStatement")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("DeviceUseStatement to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_deviceusestatement"))
        ;
        from(getKafkaTopicUri("fhirsvr_diagnosticresult"))
                .routeId("DiagnosticResult-MiddleTier")
                // set Auditing Properties
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("DiagnosticResult")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("DiagnosticResult to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_diagnosticresult"))
        ;
        from(getKafkaTopicUri("fhirsvr_effectevidencesynthesis"))
                .routeId("EffectEvidenceSynthesis-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("EffectEvidenceSynthesis")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("EffectEvidenceSynthesis to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_effectevidencesynthesis"))
        ;
        from(getKafkaTopicUri("fhirsvr_encounter"))
                .routeId("Encounter-MiddleTier")
                // set Auditing Properties
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Encounter")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Encounter to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_encounter"))
        ;
        from(getKafkaTopicUri("fhirsvr_episodeofcare"))
                .routeId("EpisodeOfCare-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("EpisodeOfCare")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("EpisodeOfCare to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_episodeofcare"))
        ;
        from(getKafkaTopicUri("fhirsvr_evidence"))
                .routeId("Evidence-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Evidence")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Evidence to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_evidence"))
        ;
        from(getKafkaTopicUri("fhirsvr_evidencevariable"))
                .routeId("EvidenceVariable-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("EvidenceVariable")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("EvidenceVariable to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_evidencevariable"))
        ;
        from(getKafkaTopicUri("fhirsvr_goal"))
                .routeId("Goal-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Goal")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Goal to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_goal"))
        ;
        from(getKafkaTopicUri("fhirsvr_healthcareservice"))
                .routeId("HealthcareService-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("HealthcareService")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Healthcare Service to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_healthcareservice"))
        ;
        from(getKafkaTopicUri("fhirsvr_imagingstudy"))
                .routeId("ImagingStudy-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ImagingStudy")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Imaging Study to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_imagingstudy"))
        ;
        from(getKafkaTopicUri("fhirsvr_immunization"))
                .routeId("Immunization-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Immunization")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Immunization to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_immunization"))
        ;
        from(getKafkaTopicUri("fhirsvr_location"))
                .routeId("Location-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Location")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Location to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_location"))
        ;
        from(getKafkaTopicUri("fhirsvr_measure"))
                .routeId("Measure-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Measure")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Measure to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_measure"))
        ;
        from(getKafkaTopicUri("fhirsvr_measurereport"))
                .routeId("MeasureReport-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("MeasureReport")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MeasureReport to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_measurereport"))
        ;
        from(getKafkaTopicUri("fhirsvr_medicationadministration"))
                .routeId("MedicationAdministration-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("MedicationAdministration")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MedicationAdministration to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_medicationadministration"))
        ;
        from(getKafkaTopicUri("fhirsvr_medicationdispense"))
                .routeId("MedicationDispense-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("MedicationDispense")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MedicationDispense to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_medicationdispense"))
        ;
        from(getKafkaTopicUri("fhirsvr_medicationrequest"))
                .routeId("MedicationRequest-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("MedicationRequest")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("MedicationRequest to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_medicationrequest"))
        ;
        from(getKafkaTopicUri("fhirsvr_observation"))
                .routeId("Observation-MiddleTier")
                // set Auditing Properties
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Observation")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Observation to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_observation"))
        ;
        from(getKafkaTopicUri("fhirsvr_order"))
                .routeId("Order-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Order")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Order to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_order"))
        ;
        from(getKafkaTopicUri("fhirsvr_organization"))
                .routeId("Organization-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Organization")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Organization to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_organization"))
        ;
        from(getKafkaTopicUri("fhirsvr_organizationaffiliation"))
                .routeId("OrganizationAffiliation-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("OrganizationAffiliation")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Organization Affiliation to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_organizationaffiliation"))
        ;
        from(getKafkaTopicUri("fhirsvr_patient"))
                .routeId("Patient-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Patient")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Patient to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_patient"))
        ;
        from(getKafkaTopicUri("fhirsvr_person"))
                .routeId("Person-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Person")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Person to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_person"))
        ;
        from(getKafkaTopicUri("fhirsvr_practitioner"))
                .routeId("Practitioner-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Practitioner")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Practitioner to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_practitioner"))
        ;
        from(getKafkaTopicUri("fhirsvr_procedure"))
                .routeId("Procedure-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Procedure")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Procedure to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_procedure"))
        ;
        from(getKafkaTopicUri("fhirsvr_questionaire"))
                .routeId("Questionaire-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Questionaire")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Questionaire to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_questionaire"))
        ;
        from(getKafkaTopicUri("fhirsvr_questionaireresponse"))
                .routeId("QuestionaireResponse-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("QuestionaireResponse")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Questionaire Response to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_questionaireresponse"))
        ;
        from(getKafkaTopicUri("fhirsvr_riskevidencesynthesis"))
                .routeId("RiskEvidenceSynthesis-MiddleTier")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("RiskEvidenceSynthesis")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("RiskEvidenceSynthesis to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_riskevidencesynthesis"))
        ;
        from(getKafkaTopicUri("fhirsvr_researchdefinition"))
                .routeId("ResearchDefinition-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ResearchDefintion")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ResearchDefinition to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_researchdefinition"))
        ;
        from(getKafkaTopicUri("fhirsvr_researchelementdefinition"))
                .routeId("ResearchElementDefinition-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ResearchElementDefintion")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ResearchElementDefinition to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_researchelementdefinition"))
        ;
        from(getKafkaTopicUri("fhirsvr_researchstudy"))
                .routeId("ResearchStudy-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ResearchStudy")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ResearchStudy to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_researchstudy"))
        ;
        from(getKafkaTopicUri("fhirsvr_researchsubject"))
                .routeId("ResearchSubject-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ResearchSubject")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ResearchSubject to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_researchsubject"))
        ;
        from(getKafkaTopicUri("fhirsvr_schedule"))
                .routeId("Schedule-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Schedule")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Schedule to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_schedule"))
        ;
        from(getKafkaTopicUri("fhirsvr_servicerequest"))
                .routeId("ServiceRequest-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("ServiceRequest")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("ServiceRequest to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_servicerequest"))
        ;
        from(getKafkaTopicUri("fhirsvr_specimen"))
                .routeId("Specimen-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Specimen")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Specimen to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_specimen"))
        ;
        from(getKafkaTopicUri("fhirsvr_substance"))
                .routeId("Substance-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("Substance")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("Substance to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_substance"))
        ;
        from(getKafkaTopicUri("fhirsvr_supplydelivery"))
                .routeId("SupplyDelivery-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("SupplyDelivery")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("SupplyDelivery to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_supplydelivery"))
        ;
        from(getKafkaTopicUri("fhirsvr_supplyrequest"))
                .routeId("SupplyRequest-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("SupplyRequest")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("SupplyRequest to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_supplyrequest"))
        ;
        from(getKafkaTopicUri("fhirsvr_testreport"))
                .routeId("TestReport-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("TestReport")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("TestReport to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_testreport"))
        ;
        from(getKafkaTopicUri("fhirsvr_testscript"))
                .routeId("TestScript-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("TestScript")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("TestScript to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_testscript"))
        ;
        from(getKafkaTopicUri("fhirsvr_verificationresult"))
                .routeId("VerificationResult-MiddleTier")
                // Auditing
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectClinical-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("VerificationResult")
                .setProperty("component").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("bodyData").simple("${body}")
                .setProperty("processname").constant("MTier")
                .setProperty("auditdetails").constant("VerificationResult to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_verificationresult"))
        ;

        /*
         *    Financial FHIR Middle Tier
         *    1. to Enterprise by Message Type
         */
        from(getKafkaTopicUri("fhirsvr_account"))
                .routeId("account-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("account")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("account to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_account"))
        ;
        from(getKafkaTopicUri("fhirsvr_chargeitem"))
                .routeId("chargeitem-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("chargeitem")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("chargeitem to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_chargeitem"))
        ;
        from(getKafkaTopicUri("fhirsvr_chargeitemdefinition"))
                .routeId("chargeitemdefinition-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("chargeitemdefinition")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("chargeitemdefinition to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_chargeitemdefinition"))
        ;
        from(getKafkaTopicUri("fhirsvr_claim"))
                .routeId("claim-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("claim")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("claim to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                //.to("kafka:ent_fhirsvr_Contract?brokers=localhost:9092")
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_claim"))
        ;
        from(getKafkaTopicUri("fhirsvr_claimresponse"))
                .routeId("claimresponses-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("claimresponses")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("claim responses to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("fhirsvr_claimresponse"))
        ;
        from(getKafkaTopicUri("fhirsvr_contract"))
                .routeId("contract-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("contract")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("contract to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_contract"))
        ;
        from(getKafkaTopicUri("fhirsvr_coverage"))
                .routeId("coverage-MiddleTier")
                // set Auditing Properties
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("coverage")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("coverage to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_coverage"))
        ;
        from(getKafkaTopicUri("fhirsvr_coverageeligibilityrequest"))
                .routeId("coverageeligibilityrequest-MiddleTier")
                // set Auditing Properties
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("coverageeligibilityrequest")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("coverageeligibilityrequest to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_coverageeligibilityrequest"))
        ;
        from(getKafkaTopicUri("fhirsvr_coverageeligibilityresponse"))
                .routeId("coverageeligibilityresponse-MiddleTier")
                // set Auditing Properties
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("coverageeligibilityresponse")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("coverageeligibilityresponse to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_coverageeligibilityresponse"))
        ;

        from(getKafkaTopicUri("fhirsvr_explanationofbenefits"))
                .routeId("explanationofbenefits-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("explanationofbenefits")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("explanationofbenefits to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_explanationofbenefits"))
        ;
        from(getKafkaTopicUri("fhirsvr_enrollmentrequest"))
                .routeId("enrollmentrequest-MiddleTier")
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("enrollmentrequest")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("enrollmentrequest to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_enrollmentrequest"))
        ;
        from(getKafkaTopicUri("fhirsvr_enrollmentreqsponse"))
                .routeId("enrollmentresponse-MiddleTier")
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("enrollmentresponse")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("enrollmentresponse to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_enrollmentreqsponse"))
        ;
        from(getKafkaTopicUri("fhirsvr_insuranceplan"))
                .routeId("insuranceplan-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("insuranceplan")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("insuranceplan to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_insuranceplan"))
        ;
        from(getKafkaTopicUri("fhirsvr_invoice"))
                .routeId("invoice-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("FHIR")
                .setProperty("messagetrigger").constant("invoice")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("invoice to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_invoice"))
        ;
        from(getKafkaTopicUri("fhirsvr_paymentnotice"))
                .routeId("paymentnotice-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("paymentnotice")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("paymentnotice to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_paymentnotice"))
        ;
        from(getKafkaTopicUri("fhirsvr_paymentreconcilliation"))
                .routeId("paymentreconciliation-MiddleTier")
                // Auditing
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-ConnectFinancial-IndustryStd")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("paymentreconciliation")
                .setProperty("component").simple("${routeId}")
                .setProperty("processname").constant("MTier")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("auditdetails").constant("paymentreconciliation to Enterprise By Data Type middle tier")
                .wireTap("direct:auditing")
                // Enterprise Message By Type
                .convertBodyTo(String.class).to(getKafkaTopicUri("ent_fhirsvr_paymentreconcilliation"))
        ;
    }
}