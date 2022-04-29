package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Name {

    public String family;
    public List<String> given;

    public List<String> getGiven() { return given; }

    public void setGiven(List<String> given) { this.given = given; }

    public String getFamily() { return family; }

    public void setFamily(String family) { this.family = family; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
