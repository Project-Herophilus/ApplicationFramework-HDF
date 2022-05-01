package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Payee {

    public Type type;

    public Type getType(){return type;}
    public void setType(Type type){this.type=type;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
