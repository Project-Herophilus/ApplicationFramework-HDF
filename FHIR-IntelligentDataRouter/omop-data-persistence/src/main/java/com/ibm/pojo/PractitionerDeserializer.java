package com.ibm.pojo;

import com.ibm.pojo.PractitionerResource.Practitioner;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class PractitionerDeserializer extends ObjectMapperDeserializer<Practitioner> {
    public PractitionerDeserializer(){
        super(Practitioner.class);
    }
}
