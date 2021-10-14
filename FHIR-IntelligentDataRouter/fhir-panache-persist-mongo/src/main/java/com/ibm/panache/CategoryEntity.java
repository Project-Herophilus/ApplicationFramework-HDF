package com.ibm.panache;

import com.ibm.domain.Coding;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class CategoryEntity extends PanacheMongoEntityBase {
    public List<CodingEntity> coding;
    public String text;
}
