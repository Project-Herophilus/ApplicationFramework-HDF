package com.ibm.pojo;

import com.ibm.pojo.RiskAssessmentResource.RiskAssessment;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class RiskAssessmentDeserializer extends ObjectMapperDeserializer<RiskAssessment> {
    public RiskAssessmentDeserializer(){
        super(RiskAssessment.class);
    }
}
