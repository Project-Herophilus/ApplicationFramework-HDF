package com.ibm.pojo.PractitionerResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Address {
    public String use;
    public List<String> line;
    public String city;
    public String state;
    public String postalCode;

    public String getUse(){ return use;}
    public void setUse(String use){this.use=use;}

    public List<String> getLine(){ return line;}
    public void setLine(List<String> line){this.line=line;}

    public String getCity(){ return city;}
    public void setCity(String city){this.city=city;}

    public String getState(){ return state;}
    public void setState(String state){this.state=state;}

    public String getPostalCode(){ return postalCode;}
    public void setPostalCode(String postalCode){this.postalCode=postalCode;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
