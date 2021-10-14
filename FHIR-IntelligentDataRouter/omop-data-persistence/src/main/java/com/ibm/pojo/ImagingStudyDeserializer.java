package com.ibm.pojo;

import com.ibm.pojo.ImagingStudyRecource.ImagingStudy;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ImagingStudyDeserializer extends ObjectMapperDeserializer<ImagingStudy> {
    public ImagingStudyDeserializer (){
        super(ImagingStudy.class);
    }
}
