package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class AddressEntity extends PanacheMongoEntityBase {
    public List<String> line;
    public String city;
    public String state;
    public String postalCode;
    public String country;
}
