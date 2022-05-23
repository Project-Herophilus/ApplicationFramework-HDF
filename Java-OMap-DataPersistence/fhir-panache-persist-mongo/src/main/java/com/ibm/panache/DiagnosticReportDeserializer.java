package com.ibm.panache;

import com.ibm.domain.CarePlan;
import com.ibm.domain.DiagnosticReport;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class DiagnosticReportDeserializer extends ObjectMapperDeserializer<DiagnosticReport> {
    public DiagnosticReportDeserializer(){
        super(DiagnosticReport.class);
    }
}