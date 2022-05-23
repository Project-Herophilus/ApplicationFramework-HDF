package com.ibm.pojo;

import com.ibm.pojo.MedicationRequestResource.MedicationRequest;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MedicationRequestDeserializer extends ObjectMapperDeserializer<MedicationRequest> {
    public MedicationRequestDeserializer(){
        super(MedicationRequest.class);
    }
}
