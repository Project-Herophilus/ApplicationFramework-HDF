package com.ibm.panache;

import com.ibm.domain.Goal;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class GoalDeserializer extends ObjectMapperDeserializer<Goal> {
    public GoalDeserializer(){
        super(Goal.class);
    }
}