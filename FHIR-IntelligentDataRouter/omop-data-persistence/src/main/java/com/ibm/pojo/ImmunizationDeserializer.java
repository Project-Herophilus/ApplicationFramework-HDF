package com.ibm.pojo;

import com.ibm.pojo.ImmunizationResource.Immunization;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ImmunizationDeserializer extends ObjectMapperDeserializer<Immunization> {
    public ImmunizationDeserializer(){
        super(Immunization.class);
    }
}
