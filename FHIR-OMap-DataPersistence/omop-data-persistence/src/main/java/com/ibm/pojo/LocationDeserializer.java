package com.ibm.pojo;

import com.ibm.pojo.LocationResource.Location;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class LocationDeserializer extends ObjectMapperDeserializer<Location> {
    public LocationDeserializer(){
        super(Location.class);
    }
}
