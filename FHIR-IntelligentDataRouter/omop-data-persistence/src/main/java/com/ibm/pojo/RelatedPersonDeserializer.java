package com.ibm.pojo;

import com.ibm.pojo.RelatedPersonResource.RelatedPerson;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class RelatedPersonDeserializer extends ObjectMapperDeserializer<RelatedPerson> {
    public RelatedPersonDeserializer(){
        super(RelatedPerson.class);
    }


}
