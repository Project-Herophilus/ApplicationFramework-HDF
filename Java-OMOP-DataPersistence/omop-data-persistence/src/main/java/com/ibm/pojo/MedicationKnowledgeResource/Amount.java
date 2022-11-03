package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Amount {
    public int value;
    public String unit;

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public String getUnit() { return unit; }

    public void setUnit(String unit) { this.unit = unit; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
