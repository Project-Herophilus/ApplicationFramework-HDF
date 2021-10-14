package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Accident {

    public String date;
    public Type type;
    public LocationAddress locationAddress;

    public Type getType(){return type;}
    public void setType(Type type){this.type=type;}


    public String getDate(){return date;}
    public void setDate(String date){this.date=date;}

    public LocationAddress getLocationAddress(){return locationAddress;}
    public void setLocationAddress(LocationAddress locationAddress){this.locationAddress=locationAddress;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
