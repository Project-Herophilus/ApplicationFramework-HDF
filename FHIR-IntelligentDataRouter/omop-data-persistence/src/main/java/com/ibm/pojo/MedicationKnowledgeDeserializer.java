package com.ibm.pojo;

import com.ibm.pojo.MedicationKnowledgeResource.MedicationKnowledge;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MedicationKnowledgeDeserializer extends ObjectMapperDeserializer<MedicationKnowledge> {
    public MedicationKnowledgeDeserializer(){
        super(MedicationKnowledge.class);
    }
}
