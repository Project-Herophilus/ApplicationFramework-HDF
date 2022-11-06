package com.ibm.pojo.RiskAssessmentResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Contained {

    public String resourceType;
    public String id;
    public String type;
    public boolean actual;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public boolean isActual(){return actual;}
    public void setActual(boolean actual){this.actual=actual;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
