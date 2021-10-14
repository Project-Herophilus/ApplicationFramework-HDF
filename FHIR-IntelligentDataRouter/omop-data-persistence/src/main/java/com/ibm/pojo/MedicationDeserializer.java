package com.ibm.pojo;

import com.ibm.pojo.MedicationResource.Medication;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MedicationDeserializer extends ObjectMapperDeserializer<Medication> {
    public MedicationDeserializer() {
        super(Medication.class);
    }
}
