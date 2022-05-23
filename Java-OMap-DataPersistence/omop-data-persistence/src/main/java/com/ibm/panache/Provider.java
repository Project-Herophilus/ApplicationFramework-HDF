package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.List;

@Entity
public class Provider extends PanacheEntityBase {

    @Id
    public String id;
    public String provider_name =null;
    public String npi = null;
    public String dea =null;
    public String specialty_concept_id;
    public String care_site_id =null;
    public String year_of_birth =null;
    public String gender_concept_id;
    public String provider_source_value =null;
    public String specialty_source_value=null;
    public int specialty_source_concept_id=0;
    public String gender_source_value =null;
    public int gender_source_concept_id=0;

    public static Provider findProvider(String providerId){
        return find("id", providerId).firstResult();
    }


}
