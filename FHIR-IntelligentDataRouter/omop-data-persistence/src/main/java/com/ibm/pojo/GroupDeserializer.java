package com.ibm.pojo;

import com.ibm.pojo.GroupResource.Group;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class GroupDeserializer extends ObjectMapperDeserializer<Group> {
    public GroupDeserializer(){
        super(Group.class);
    }
}
