package com.ibm.pojo;

import com.ibm.pojo.ClinicalImpressionResource.ClinicalImpression;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ClinicalImpressionDeserializer extends ObjectMapperDeserializer<ClinicalImpression> {
    public ClinicalImpressionDeserializer(){
        super(ClinicalImpression.class);
    }
}
