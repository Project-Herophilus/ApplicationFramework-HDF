package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Link {
    public Other other;
    public String type;

    public Other getOther(){return other;}
    public void setOther(Other other){this.other=other;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
