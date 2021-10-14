package com.ibm.pojo.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DoseQuantity {
    public int value;
    public String system;
    public String code;

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
