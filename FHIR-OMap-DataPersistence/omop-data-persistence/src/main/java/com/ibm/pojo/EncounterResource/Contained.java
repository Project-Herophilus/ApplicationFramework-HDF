package com.ibm.pojo.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Contained {

    public String resourceType;
    public String id;
    public String description;
    public String mode;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String getMode(){return mode;}
    public void setMode(String mode){this.mode=mode;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
