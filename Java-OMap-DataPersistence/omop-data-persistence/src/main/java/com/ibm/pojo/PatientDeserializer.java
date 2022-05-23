package com.ibm.pojo;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import com.ibm.pojo.PatientResource.Patient;

public class PatientDeserializer extends ObjectMapperDeserializer<Patient> {
    public PatientDeserializer(){
        super(Patient.class);
        
    }
}
