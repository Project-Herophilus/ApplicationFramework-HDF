package com.ibm.pojo;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import com.ibm.pojo.ObservationResource.Observation;

public class ObservationDeserializer extends ObjectMapperDeserializer<Observation>{
    public ObservationDeserializer(){
        super(Observation.class);
    }
}
