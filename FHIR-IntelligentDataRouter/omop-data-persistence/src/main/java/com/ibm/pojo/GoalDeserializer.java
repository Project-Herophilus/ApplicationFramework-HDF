package com.ibm.pojo;

import com.ibm.pojo.GoalResource.Goal;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class GoalDeserializer extends ObjectMapperDeserializer<Goal> {
    public GoalDeserializer(){
        super(Goal.class);
    }

}
