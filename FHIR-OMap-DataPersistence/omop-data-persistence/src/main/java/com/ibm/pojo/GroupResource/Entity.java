package com.ibm.pojo.GroupResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Entity {

    public String reference;    //patient

    public String getReference(){return reference;}
    public void setReference(String reference){this.reference=reference;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
