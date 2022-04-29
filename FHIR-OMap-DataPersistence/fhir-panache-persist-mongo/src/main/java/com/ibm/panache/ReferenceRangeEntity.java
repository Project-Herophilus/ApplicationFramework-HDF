package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class ReferenceRangeEntity extends PanacheMongoEntityBase {

    public LowEntity low;
    public HighEntity high;
    public List<AppliesToEntity> appliesTo;
}
