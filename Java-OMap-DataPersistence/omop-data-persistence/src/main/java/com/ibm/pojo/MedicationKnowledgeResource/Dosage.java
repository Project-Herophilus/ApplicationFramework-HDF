package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Dosage {
    public Type type;
    public int dosage;

    public int getDosage() { return dosage; }

    public void setDosage(int dosage) { this.dosage = dosage; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
