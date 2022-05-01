package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class RelatedMedicationKnowledge {
    public Type type;
    public String reference;

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
