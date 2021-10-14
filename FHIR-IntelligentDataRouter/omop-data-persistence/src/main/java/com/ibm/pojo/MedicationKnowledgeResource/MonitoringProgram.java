package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MonitoringProgram {
    public Type type;
    public String name;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
