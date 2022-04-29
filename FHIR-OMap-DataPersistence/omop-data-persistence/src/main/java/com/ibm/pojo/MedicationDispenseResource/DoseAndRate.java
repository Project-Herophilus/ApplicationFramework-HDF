package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DoseAndRate {
    public Type type;
    public DoseQuantity doseQuantity;
    public RateRatio rateRatio;
    public DoseRange doseRange;
    public RateRange rateRange;

    public RateRange getRateRange() { return rateRange; }

    public void setRateRange(RateRange rateRange) { this.rateRange = rateRange; }

    public DoseRange getDoseRange() { return doseRange; }

    public void setDoseRange(DoseRange doseRange) { this.doseRange = doseRange; }

    public RateRatio getRateRatio() { return rateRatio; }

    public void setRateRatio(RateRatio rateRatio) { this.rateRatio = rateRatio; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public DoseQuantity getDoseQuantity() { return doseQuantity; }

    public void setDoseQuantity(DoseQuantity doseQuantity) { this.doseQuantity = doseQuantity; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
