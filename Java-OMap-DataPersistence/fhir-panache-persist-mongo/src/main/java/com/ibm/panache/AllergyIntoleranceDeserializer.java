package com.ibm.panache;

import com.ibm.domain.AllergyIntolerance;
import com.ibm.domain.FhirRequest;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class AllergyIntoleranceDeserializer extends ObjectMapperDeserializer<AllergyIntolerance> {
    public AllergyIntoleranceDeserializer(){
        super(AllergyIntolerance.class);
    }
}