package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class TextEntity  extends PanacheMongoEntityBase {
    public String status;
    public String div;
}
