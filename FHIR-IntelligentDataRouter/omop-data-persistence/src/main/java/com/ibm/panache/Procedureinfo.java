package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Procedureinfo extends PanacheEntityBase {
    @Id
    public String id;
    public String person_id;
    public String procedure_date =null;
    public String procedure_datetime;
    public String procedure_type_concept_id =null;
    public int modifier_concept_id=0;
    public String quantity=null;
    public String provider_id = null;
    public String visit_occurrence_id = null;
    public BigInteger visit_detail_id = null;
    public String procedure_source_value =null;
    public String procedure_source_concept_id = null;
    public String modifier_source_value = null;

    public static Procedureinfo findProcedure(String procedureId){
        return find("id", procedureId).firstResult();
    }


}
