package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class LowEntity extends PanacheMongoEntityBase {
    public double value;
    public String unit;
    public String system;
    public String code;
}
