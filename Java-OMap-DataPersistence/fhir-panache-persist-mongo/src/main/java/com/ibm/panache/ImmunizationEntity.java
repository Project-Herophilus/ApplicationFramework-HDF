package com.ibm.panache;

import com.ibm.domain.VaccineCode;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.Date;

@MongoEntity(collection = "US_CORE_DATA")
public class ImmunizationEntity extends FhirRequestEntity{
    public VaccineCodeEntity vaccineCode;
    public String occurrenceDateTime;
    public boolean primarySource;
}
