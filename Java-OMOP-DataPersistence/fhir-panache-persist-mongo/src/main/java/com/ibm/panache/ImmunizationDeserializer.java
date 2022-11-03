package com.ibm.panache;

import com.ibm.domain.Immunization;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ImmunizationDeserializer extends ObjectMapperDeserializer<Immunization> {
    public ImmunizationDeserializer(){
        super(Immunization.class);
    }
}