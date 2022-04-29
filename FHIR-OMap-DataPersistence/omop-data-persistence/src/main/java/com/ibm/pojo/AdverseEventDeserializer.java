package com.ibm.pojo;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import com.ibm.pojo.AdverseEventResource.AdverseEvent;

public class AdverseEventDeserializer extends ObjectMapperDeserializer<AdverseEvent> {
    public AdverseEventDeserializer(){
        super(AdverseEvent.class);

    }
}
