package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.Date;

@MongoEntity
public class EffectivePeriodEntity extends PanacheMongoEntityBase {
    public String start;
    public String end;
}
