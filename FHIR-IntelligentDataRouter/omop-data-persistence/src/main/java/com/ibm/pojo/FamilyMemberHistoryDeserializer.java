package com.ibm.pojo;

import com.ibm.pojo.FamilyMemberHistoryResource.FamilyMemberHistory;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class FamilyMemberHistoryDeserializer extends ObjectMapperDeserializer<FamilyMemberHistory> {
    public FamilyMemberHistoryDeserializer(){
        super(FamilyMemberHistory.class);
    }
}
