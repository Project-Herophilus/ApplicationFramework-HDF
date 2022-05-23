package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Denominator {
    public String system;
    public String code;
    public int value;

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
