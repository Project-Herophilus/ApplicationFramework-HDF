package com.ibm.pojo;

import com.ibm.pojo.ServiceRequestResource.ServiceRequest;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ServiceRequestDeserializer extends ObjectMapperDeserializer<ServiceRequest> {
    public ServiceRequestDeserializer(){
        super(ServiceRequest.class);
    }
}
