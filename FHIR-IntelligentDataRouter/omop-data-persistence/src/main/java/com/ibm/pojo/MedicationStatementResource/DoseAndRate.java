package com.ibm.pojo.MedicationStatementResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DoseAndRate {
    public Type type;
    public DoseRange doseRange;
    public DoseQuantity doseQuantity;

    public DoseQuantity getDoseQuantity() { return doseQuantity; }

    public void setDoseQuantity(DoseQuantity doseQuantity) { this.doseQuantity = doseQuantity; }

    public DoseRange getDoseRange() { return doseRange; }

    public void setDoseRange(DoseRange doseRange) { this.doseRange = doseRange; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
