package com.ibm.pojo;

import com.ibm.pojo.CarePlanResource.CarePlan;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class CarePlanDeserializer extends ObjectMapperDeserializer<CarePlan> {
    public CarePlanDeserializer(){
        super(CarePlan.class);
    }
}
