package com.ibm.panache;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class AllergyIntoleranceEntity extends FhirRequestEntity {
    public PatientEntity patient;
    public List<String> category;

}
