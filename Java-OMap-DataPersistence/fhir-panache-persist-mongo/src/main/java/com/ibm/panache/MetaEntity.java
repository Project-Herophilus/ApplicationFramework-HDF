package com.ibm.panache;

import com.ibm.domain.Extension;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class MetaEntity extends PanacheMongoEntityBase {
    public List<ExtensionEntity> extension;
    public List<String> profile;
}
