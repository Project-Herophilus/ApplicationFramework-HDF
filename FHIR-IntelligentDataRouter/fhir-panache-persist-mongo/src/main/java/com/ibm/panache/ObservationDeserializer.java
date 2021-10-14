package com.ibm.panache;

import com.ibm.domain.Observation;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ObservationDeserializer extends ObjectMapperDeserializer<Observation> {
    public ObservationDeserializer(){
        super(Observation.class);
    }
}