package com.ibm.panache;

import com.ibm.domain.Category;
import com.ibm.domain.Performer;
import com.ibm.domain.PresentedForm;
import com.ibm.domain.Result;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.Date;
import java.util.List;

@MongoEntity(collection = "US_CORE_DATA")
public class DiagnosticReportEntity extends FhirRequestEntity {

    public List<CategoryEntity> category;
    public String effectiveDateTime;
    public String issued;
    public List<PresentedFormEntity> presentedForm;
    public List<PerformerEntity> performer;
    public List<ResultEntity> result;
}
