package com.ibm.pojo;

import com.ibm.pojo.OrganizationResource.Organization;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class OrganizationDeserializer extends ObjectMapperDeserializer<Organization> {
    public OrganizationDeserializer(){
        super(Organization.class);

    }
}
