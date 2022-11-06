package com.ibm.pojo;

import com.ibm.pojo.PractitionerRoleResource.PractitionerRole;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class PractitionerRoleDeserializer extends ObjectMapperDeserializer<PractitionerRole> {
    public PractitionerRoleDeserializer(){
        super(PractitionerRole.class);
    }
}
