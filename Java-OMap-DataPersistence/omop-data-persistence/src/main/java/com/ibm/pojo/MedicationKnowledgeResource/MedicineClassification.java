package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MedicineClassification {
    public Type type;
    public Classification classification;

    public Classification getClassification() { return classification; }

    public void setClassification(Classification classification) { this.classification = classification; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
