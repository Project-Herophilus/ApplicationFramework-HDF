package com.ibm.pojo;

import com.ibm.pojo.FamilyHistoryResource.FamilyHistory;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class FamilyHistoryDeserializer extends ObjectMapperDeserializer<FamilyHistory> {
    public FamilyHistoryDeserializer(){
        super(FamilyHistory.class);

    }

}
