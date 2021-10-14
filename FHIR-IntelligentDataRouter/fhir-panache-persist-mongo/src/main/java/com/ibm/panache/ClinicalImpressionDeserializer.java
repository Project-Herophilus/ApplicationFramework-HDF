package com.ibm.panache;

import com.ibm.domain.ClinicalImpression;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ClinicalImpressionDeserializer extends ObjectMapperDeserializer<ClinicalImpression> {
    public ClinicalImpressionDeserializer(){
        super(ClinicalImpression.class);
    }
}