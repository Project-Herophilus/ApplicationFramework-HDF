package com.ibm.pojo.OrganizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contact {
    public Purpose purpose;
    public Name name;
    public List<Telecom> telecom;
    public Address address;

    public Purpose getPurpose(){return purpose;}
    public void setPurpose(Purpose purpose){this.purpose=purpose;}


    public Name getName(){return name;}
    public void setName(Name name){this.name=name;}

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}

    public Address getAddress(){return address;}
    public void setAddress(Address address){this.address=address;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
