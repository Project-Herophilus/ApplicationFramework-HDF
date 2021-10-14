package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class ResponsibleParty {
    public String reference;

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
