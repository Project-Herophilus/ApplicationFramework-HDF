package com.ibm.panache;

import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class CarePlanEntity extends FhirRequestEntity{
    public List<CategoryEntity> category;
}
