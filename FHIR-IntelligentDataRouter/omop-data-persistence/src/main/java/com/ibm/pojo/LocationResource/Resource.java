package com.ibm.pojo.LocationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Resource {
    public String resourceType;
    public String id;
    public Text text;
    public String status;
    public String name;
    public String mode;
    public PartOf partOf;

    public Text getText() { return text; }

    public void setText(Text text) { this.text = text; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public PartOf getPartOf() { return partOf; }

    public void setPartOf(PartOf partOf) { this.partOf = partOf; }

    public String getMode() { return mode; }

    public void setMode(String mode) { this.mode = mode; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
