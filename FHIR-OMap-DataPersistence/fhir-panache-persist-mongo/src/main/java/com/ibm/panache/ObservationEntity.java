package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class ObservationEntity extends PanacheMongoEntityBase {

    @BsonId
    public String id;
    public String resourceType;
    public MetaEntity meta;
    public TextEntity text;
    public String status;
    public List<CategoryEntity> category;
    public CodeEntity code;
    public SubjectEntity subject;
    public EncounterEntity encounter;
    public String effectiveDateTime;
    public ValueQuantityEntity valueQuantity;
    public List<ReferenceRangeEntity> referenceRange;
    public List<ComponentEntity> component;
}
