package com.ibm.pojo;

import com.ibm.pojo.ImmunizationRecommendationResource.ImmunizationRecommendation;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ImmunizationRecommendationDeserializer extends ObjectMapperDeserializer<ImmunizationRecommendation> {
    public ImmunizationRecommendationDeserializer() {
        super(ImmunizationRecommendation.class);
    }
}
