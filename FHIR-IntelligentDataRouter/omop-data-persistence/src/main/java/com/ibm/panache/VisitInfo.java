package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class VisitInfo extends PanacheEntityBase{
    @Id
    public String id;
    public String person_id;
    public String visit_concept_id;
    public String visit_start_date= null;
    public String visit_start_datetime;
    public String visit_end_date=null;
    public String visit_end_datetime;
    public String visit_type_concept_id;
    public String provider_id=null;
    public String care_site_id	=null;
    public String visit_source_value=null;
    public int visit_source_concept_id;
    public String admitted_from_concept_id;
    public String admitted_from_source_value=null;
    public String discharge_to_source_value=null;
    public String discharge_to_concept_id;
    public String preceding_visit_occurrence_id=null;

    public static VisitInfo findVisit(String visitId){
        return find("id", visitId).firstResult();
    }

}
