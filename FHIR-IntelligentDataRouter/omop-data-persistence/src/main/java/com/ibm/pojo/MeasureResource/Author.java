package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Author {

    public String name;


    public String getName(){return name;}
    public void setName(String name){this.name=name;}




    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
