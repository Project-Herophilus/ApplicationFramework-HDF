package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class PresentedFormEntity extends PanacheMongoEntityBase {
    public String contentType;
    public String url;
    public String hash;
    public String data;
}
