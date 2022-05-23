package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Class {

    public Type type;
    public String value;
    public String name;

    public Type getType(){return type;}
    public void setType(Type type){this.type=type;}

    public String getValue(){return value;}
    public void setValue(String value){this.value=value;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
