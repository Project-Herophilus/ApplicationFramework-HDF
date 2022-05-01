package com.ibm.panache;

import com.ibm.domain.Condition;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ConditionDeserializer extends ObjectMapperDeserializer<Condition> {
    public ConditionDeserializer(){
        super(Condition.class);
    }
}