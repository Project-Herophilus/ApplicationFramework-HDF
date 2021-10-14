package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Contained {
    public String resourceType;
    public String id;
    public String code;

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
