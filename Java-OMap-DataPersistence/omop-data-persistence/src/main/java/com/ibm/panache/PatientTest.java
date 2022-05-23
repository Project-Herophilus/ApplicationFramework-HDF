package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientTest extends PanacheEntityBase {

    @Id
    public String id;
    public String birthdate=null;
    public String deathdate=null;
    public String ssn=null;
    public String drivers=null;
    public String passport=null;
    public String prefix=null;
    public String first=null;
    public String last=null;
    public String suffix=null;
    public String maiden=null;
    public String marital=null;
    public String race=null;
    public String ethnicity=null;
    public String gender=null;
    public String birthplace=null;
    public String address=null;
    public String city=null;
    public String state=null;
    public String county=null;
    public String zip=null;
    public double lat=0.0;
    public double  lon=0.0;
    public double healthcare_expenses=0.0;
    public double healthcare_coverage=0.0;
}
