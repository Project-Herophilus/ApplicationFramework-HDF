package com.ibm.panache;

import com.ibm.domain.Category;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class ConditionEntity extends FhirRequestEntity{

    public List<CategoryEntity> category;
    public String onsetDateTime;
}
