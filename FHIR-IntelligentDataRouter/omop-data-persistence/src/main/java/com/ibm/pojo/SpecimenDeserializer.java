package com.ibm.pojo;

import com.ibm.pojo.SpecimenResource.Specimen;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class SpecimenDeserializer extends ObjectMapperDeserializer<Specimen> {
    public SpecimenDeserializer() {
        super(Specimen.class);
    }
}
