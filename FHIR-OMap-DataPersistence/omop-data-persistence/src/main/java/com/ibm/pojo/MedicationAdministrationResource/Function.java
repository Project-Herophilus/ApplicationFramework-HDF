package com.ibm.pojo.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Function {
    public List<Coding> coding;

    public List<Coding> getCoding() { return coding; }

    public void setCoding(List<Coding> coding) { this.coding = coding; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
