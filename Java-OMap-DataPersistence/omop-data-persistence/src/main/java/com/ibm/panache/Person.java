package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Person extends PanacheEntityBase {

    @Id
    public String id;
    public int gender_id = 0;
    public String year_of_birth =null;
    public String month_of_birth = null;
    public String day_of_birth = null;
    public String birth_datetime = null;
    public String death_datetime = null;
    public int race_concept_id = 0;
    public int ethnicity_concept_id = 0;
    public String location_id;
    public String provider_id = null;
    public String care_site_id = null;
    public String person_source_value = null;
    public String gender_source_value = null;
    public String gender_concept_id = null;
    public String race_source_value = null;
    public int race_source_concept_id = 0;
    public String ethnicity_source_value = null;
    public int ethnicity_source_concept_id = 0;

    public static Person findPerson(String personID){
        return find("id", personID).firstResult();
    }
}
