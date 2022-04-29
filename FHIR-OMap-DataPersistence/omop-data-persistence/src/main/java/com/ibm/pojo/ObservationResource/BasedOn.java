package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BasedOn {

    public Identifier identifier;

     public Identifier getIdentifier(){return identifier;}
     public void setIdentifier(Identifier identifier){this.identifier=identifier;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
