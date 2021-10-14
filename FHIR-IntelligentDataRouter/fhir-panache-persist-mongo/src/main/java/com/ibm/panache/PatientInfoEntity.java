package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class PatientInfoEntity extends PanacheMongoEntityBase {
    @BsonId
    public String id;
    public String resourceType;
    public MetaEntity meta;
    public TextEntity text;
    public List<ExtensionEntity> extension;
    public List<IdentifierEntity> identifier;
    public boolean active;
    public List<NameEntity> name;
    public List<TelecomEntity> telecom;
    public String gender;
    public String birthDate;
    public List<AddressEntity> address;
}
