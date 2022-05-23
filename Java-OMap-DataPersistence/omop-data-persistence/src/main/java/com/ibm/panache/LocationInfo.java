package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LocationInfo extends PanacheEntityBase {

    @Id @GeneratedValue
    public String id;
    public String address_1=null;
    public String address_2=null;
    public String city=null;
    public String state=null;
    public String zip=null;
    public String county = null;
    public String country = null;
    public String source = null;
    public double latitude = 0;
    public double longitude = 0;

    public static LocationInfo findLocation(String locationId){
        return find("id", locationId).firstResult();
    }

}

