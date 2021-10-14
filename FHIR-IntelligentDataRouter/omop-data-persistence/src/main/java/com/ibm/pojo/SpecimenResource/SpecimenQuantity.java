package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SpecimenQuantity {
    public int value;
    public String unit;

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public void setUnit(String unit) { this.unit = unit; }

    public String getUnit() { return unit; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
