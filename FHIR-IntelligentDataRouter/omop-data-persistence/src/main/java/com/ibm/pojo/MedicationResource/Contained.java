package com.ibm.pojo.MedicationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Contained {
    public String resourceType;
    public String id;
    public String name;
    public Code code;

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
