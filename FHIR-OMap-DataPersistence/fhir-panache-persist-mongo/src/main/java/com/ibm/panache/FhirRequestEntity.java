package com.ibm.panache;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.domain.Category;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.List;

public class FhirRequestEntity extends PanacheMongoEntityBase {
    @BsonId
    public String id;
    public String resourceType;
    public MetaEntity meta;
    public TextEntity text;
    public String status;
    public String intent;
    public ClinicalStatusEntity clinicalStatus;
    public VerificationStatusEntity verificationStatus;
    public String criticality;
    public CodeEntity code;
    public String recordedDate;
    public RecorderEntity recorder;
    public List<ReactionEntity> reaction;
    public SubjectEntity subject;
}
