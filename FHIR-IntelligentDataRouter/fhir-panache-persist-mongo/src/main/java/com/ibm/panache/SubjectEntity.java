package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class SubjectEntity extends PanacheMongoEntityBase {
    public String reference;
    public String display;
}
