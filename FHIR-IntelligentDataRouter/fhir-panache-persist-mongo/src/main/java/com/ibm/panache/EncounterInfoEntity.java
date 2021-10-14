package com.ibm.panache;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.domain.Period;
import com.ibm.domain.Type;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class EncounterInfoEntity extends FhirRequestEntity{
    @JsonProperty("class")
    public ClassInfoEntity classInfo;
    public List<TypeEntity> type;
    public PeriodEntity period;
    public String resourceType;
    public String id;
    public MetaEntity meta;
    public TextEntity text;
    public String status;
    public SubjectEntity subject;
    public List<IdentifierEntity> identifier;
}
