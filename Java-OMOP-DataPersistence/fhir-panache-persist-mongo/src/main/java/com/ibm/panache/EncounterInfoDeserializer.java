package com.ibm.panache;

import com.ibm.domain.EncounterInfo;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class EncounterInfoDeserializer extends ObjectMapperDeserializer<EncounterInfo> {
    public EncounterInfoDeserializer(){
        super(EncounterInfo.class);
    }
}