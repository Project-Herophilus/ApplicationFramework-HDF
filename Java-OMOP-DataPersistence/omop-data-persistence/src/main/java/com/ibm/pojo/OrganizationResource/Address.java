package com.ibm.pojo.OrganizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Address {
    public List<String> line;

    public List<String> getLine(){ return line;}
    public void setLine(List<String> line){this.line=line;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
