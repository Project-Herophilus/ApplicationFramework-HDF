package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class TelecomEntity extends PanacheMongoEntityBase {
    public String system;
    public String value;
}
