package com.ibm.pojo.MedicationStatementResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Low {
    public int value;
    public String unit;
    public String system;
    public String code;

    public int getValue() { return this.value; }

    public void setValue(int value) { this.value = value; }

    public String getUnit() { return this.unit; }

    public void setUnit(String unit) { this.unit = unit; }

    public String getSystem() { return this.system; }

    public void setSystem(String system) { this.system = system; }

    public String getCode() { return this.code; }

    public void setCode(String code) { this.code = code; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
