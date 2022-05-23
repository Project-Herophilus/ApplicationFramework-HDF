package com.ibm.panache;

import com.ibm.domain.Period;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;
@MongoEntity
public class NameEntity extends PanacheMongoEntityBase {
    public String family;
    public List<String> given;
    public PeriodEntity period;
    public List<String> suffix;
}
