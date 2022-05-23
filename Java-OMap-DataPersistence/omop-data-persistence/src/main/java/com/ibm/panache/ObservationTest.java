package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class ObservationTest extends PanacheEntityBase {

    @Id
    public String id;
    public String person_id;
    public String observation_concept_id;
    public String observation_date = null;
    public String observation_datetime;
    public String observation_type_concept_id;
    public double value_as_number;
    public String value_as_string = null;
    public String value_as_concept_id =null;
    public String qualifier_concept_id=null;
    public double unit_concept_id =0;
    public String provider_id = null;
    public String visit_occurrence_id = null;
    public int visit_detail_id = 0;
    public String observation_source_value =null;
    public int observation_source_concept_id;
    public String unit_source_value = null;
    public String qualifier_source_value = null;
    public int observation_event_id = 0;
    public int obs_event_field_concept_id;
    public Timestamp value_as_datetime;

    public static ObservationTest findObs(String obsId){
        return find("id", obsId).firstResult();
    }

}
