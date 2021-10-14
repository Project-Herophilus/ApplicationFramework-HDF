package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Enterer {

    public Identifier identifier;


    public Identifier getIdentifier(){return identifier;}
    public void setIdentifier(Identifier identifier){this.identifier=identifier;}


    
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
