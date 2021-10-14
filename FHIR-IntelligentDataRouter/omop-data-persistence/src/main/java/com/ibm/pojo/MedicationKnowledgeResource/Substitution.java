package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Substitution {
    public Type type;
    public Boolean allowed;

    public Boolean getAllowed() { return allowed; }

    public void setAllowed(Boolean allowed) { this.allowed = allowed; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
