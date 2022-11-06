package com.ibm.panache;

import com.ibm.pojo.SpecimenResource.Subject;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class SpecimenTest extends PanacheEntityBase {
    @Id
    public String id;
    public String person_id;
    public String specimen_concept_id = null;
    public String specimen_type_concept_id = null;
    public Date specimen_date=null;
    public String specimen_dateTime;
    public String quantity;
    public String unit_concept_id;
    public String anatomic_site_concept_id = null;
    public String disease_status_concept_id = null;
    public String specimen_source_id = null;
    public String specimen_source_value =null;
    public String unit_source_value=null;
    public String anatomic_site_source_value = null;
    public String disease_status_source_value = null;

    public static SpecimenTest findSpecimen(String specimenId){
        return find("id", specimenId).firstResult();
    }

}
