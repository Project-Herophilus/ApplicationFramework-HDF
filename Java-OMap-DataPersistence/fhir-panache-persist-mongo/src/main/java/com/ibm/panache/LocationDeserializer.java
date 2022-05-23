package com.ibm.panache;

import com.ibm.domain.EncounterInfo;
import com.ibm.domain.Location;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class LocationDeserializer extends ObjectMapperDeserializer<Location> {
    public LocationDeserializer(){
        super(Location.class);
    }
}