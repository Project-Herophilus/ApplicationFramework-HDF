package com.ibm.panache;

import com.ibm.domain.PatientInfo;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class PatientInfoDeserializer extends ObjectMapperDeserializer<PatientInfo> {
    public PatientInfoDeserializer(){
        super(PatientInfo.class);
    }
}