package com.ibm.pojo;


import com.ibm.pojo.ClaimResource.Claims;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ClaimDeserializer extends ObjectMapperDeserializer<Claims> {
    public ClaimDeserializer(){
        super(Claims.class);

    }
}
