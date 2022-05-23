package com.ibm.panache;


import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class ReactionEntity extends PanacheMongoEntityBase {
   public List<ManifestationEntity> manifestation;
   public String severity;
}
