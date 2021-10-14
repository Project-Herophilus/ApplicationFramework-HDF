package com.ibm.pojo;

import com.ibm.pojo.ImmunizationEvaluationResource.ImmunizationEvaluation;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ImmunizationEvaluationDeserializer extends ObjectMapperDeserializer<ImmunizationEvaluation> {
    public ImmunizationEvaluationDeserializer(){
        super(ImmunizationEvaluation.class);
    }
}
