package com.ibm.pojo;

import com.ibm.pojo.EncounterResource.Encounter;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class EncounterDeserializer extends ObjectMapperDeserializer<Encounter> {
    public EncounterDeserializer(){
        super(Encounter.class);

    }
}
