package com.ibm.pojo;

import com.ibm.pojo.MedicationDispenseResource.MedicationDispense;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MedicationDispenseDeserializer extends ObjectMapperDeserializer<MedicationDispense> {
    public MedicationDispenseDeserializer() {
        super(MedicationDispense.class);
    }
}
