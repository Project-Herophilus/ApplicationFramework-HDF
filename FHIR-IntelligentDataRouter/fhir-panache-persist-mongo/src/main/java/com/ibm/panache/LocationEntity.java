package com.ibm.panache;

import com.ibm.domain.*;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class LocationEntity extends FhirRequestEntity{
    public List<IdentifierEntity> identifier;
    public String name;
    public String description;
    public List<TelecomEntity> telecom;
    public AddressEntity address;
    public PositionEntity position;
    public ManagingOrganizationEntity managingOrganization;
}
