package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contact {

    public List<Telecom> telecom;

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
