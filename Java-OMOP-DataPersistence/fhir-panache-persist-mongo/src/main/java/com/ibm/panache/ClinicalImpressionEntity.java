package com.ibm.panache;

import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class ClinicalImpressionEntity extends FhirRequestEntity{
    public List<IdentifierEntity> identifier;
    public String description;
    public EncounterEntity encounter;
    public EffectivePeriodEntity effectivePeriod;
    public String date;
    public AssessorEntity assessor;
    public List<ProblemEntity> problem;
    public List<InvestigationEntity> investigation;
    public String summary;
    public List<FindingEntity> finding;
}
