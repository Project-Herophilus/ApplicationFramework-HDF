package com.ibm.pojo;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import com.ibm.pojo.AllergyIntoleranceResource.AllergyIntolerence;

public class AllergyIntoleranceDeserializer extends ObjectMapperDeserializer<AllergyIntolerence> {
    public AllergyIntoleranceDeserializer(){
        super(AllergyIntolerence.class);

    }
}
