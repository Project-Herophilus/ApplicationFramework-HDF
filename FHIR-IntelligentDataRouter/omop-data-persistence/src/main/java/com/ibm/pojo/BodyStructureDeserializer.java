package com.ibm.pojo;

import com.ibm.pojo.BodyStructureResource.BodyStructure;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class BodyStructureDeserializer extends ObjectMapperDeserializer<BodyStructure> {
    public BodyStructureDeserializer(){
        super(BodyStructure.class);
    }
}
