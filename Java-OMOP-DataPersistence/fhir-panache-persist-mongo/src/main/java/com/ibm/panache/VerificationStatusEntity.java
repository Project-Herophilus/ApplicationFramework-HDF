package com.ibm.panache;


import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class VerificationStatusEntity extends PanacheMongoEntityBase {
   public List<CodingEntity> coding;
}
