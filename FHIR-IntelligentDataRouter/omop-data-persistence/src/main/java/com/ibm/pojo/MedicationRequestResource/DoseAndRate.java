package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DoseAndRate {
    public Type type;
    public DoseQuantity doseQuantity;
    public DoseRange doseRange;
    public RateRange rateRange;
    public RateRatio rateRatio;

    public RateRatio getRateRatio() { return rateRatio; }

    public void setRateRatio(RateRatio rateRatio) { this.rateRatio = rateRatio; }

    public RateRange getRateRange() { return rateRange; }

    public void setRateRange(RateRange rateRange) { this.rateRange = rateRange; }

    public DoseRange getDoseRange() { return doseRange; }

    public void setDoseRange(DoseRange doseRange) { this.doseRange = doseRange; }

    public DoseQuantity getDoseQuantity() { return doseQuantity; }

    public void setDoseQuantity(DoseQuantity doseQuantity) { this.doseQuantity = doseQuantity; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
