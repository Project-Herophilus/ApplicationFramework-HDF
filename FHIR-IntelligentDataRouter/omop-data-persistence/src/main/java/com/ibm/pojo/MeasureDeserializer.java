package com.ibm.pojo;

import com.ibm.pojo.AllergyIntoleranceResource.AllergyIntolerence;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import com.ibm.pojo.MeasureResource.Measure;

public class MeasureDeserializer extends ObjectMapperDeserializer<Measure>{
    public MeasureDeserializer(){
        super(Measure.class);
    }
}
