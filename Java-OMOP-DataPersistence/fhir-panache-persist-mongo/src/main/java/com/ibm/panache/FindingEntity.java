package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class FindingEntity extends PanacheMongoEntityBase {
    public ItemCodeableConceptEntity itemCodeableConcept;
}
