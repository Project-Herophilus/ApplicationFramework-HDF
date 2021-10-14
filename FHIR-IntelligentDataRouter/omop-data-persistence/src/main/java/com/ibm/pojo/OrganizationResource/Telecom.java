package com.ibm.pojo.OrganizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Telecom {

    public String system;
    public String value;

    public String getSystem(){ return system;}
    public void setSystem(String system){this.system=system;}


    public String getValue(){ return value;}
    public void setValue(String value){this.value=value;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
