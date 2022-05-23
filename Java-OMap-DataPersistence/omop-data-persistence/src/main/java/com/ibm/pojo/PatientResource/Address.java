package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;
import java.util.Optional;

public class Address {
    public String use;
    public String type;
    public String text;
    public List<String> line;
    public String city = null;
    public String district= null;
    public String state= null;
    public String postalCode= null;
    public Period period;


    public String getUse(){ return use;}
    public void setUse(String use){this.use=use;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public String getText(){return text;}
    public void setText(String text){this.text=text;}

    public List<String> getLine(){ return line;}
    public void setLine(List<String> line){this.line=line;}

    public String getCity(){ return city;}
    public void setCity(String city){this.city=city;}

    public String getDistrict(){ return district;}
    public void setDistrict(String district){this.district=district;}


    public String getState(){ return state;}
    public void setState(String state){this.state=state;}

    public String getPostalCode(){ return postalCode;}
    public void setPostalCode(String postalCode){this.postalCode=postalCode;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
