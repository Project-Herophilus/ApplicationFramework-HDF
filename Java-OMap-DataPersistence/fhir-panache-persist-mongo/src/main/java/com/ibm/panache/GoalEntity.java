package com.ibm.panache;

import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class GoalEntity extends FhirRequestEntity{
    public String lifecycleStatus;
    public DescriptionEntity description;
    public List<TargetEntity> target;
}
