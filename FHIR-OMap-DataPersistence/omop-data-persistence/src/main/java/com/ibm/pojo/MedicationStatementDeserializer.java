package com.ibm.pojo;

import com.ibm.pojo.MedicationStatementResource.MedicationStatement;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MedicationStatementDeserializer extends ObjectMapperDeserializer<MedicationStatement> {
    public MedicationStatementDeserializer() {
        super(MedicationStatement.class);
    }
}
