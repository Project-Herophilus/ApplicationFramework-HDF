package com.ibm.panache;

import com.ibm.domain.CarePlan;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class CarePlanDeserializer extends ObjectMapperDeserializer<CarePlan> {
    public CarePlanDeserializer(){
        super(CarePlan.class);
    }
}