package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Repeat {
    public int frequency;
    public int period;
    public int periodMax;
    public String periodUnit;
    public BoundsPeriod boundsPeriod;

    public BoundsPeriod getBoundsPeriod() { return boundsPeriod; }

    public void setBoundsPeriod(BoundsPeriod boundsPeriod) { this.boundsPeriod = boundsPeriod; }

    public int getPeriodMax() { return periodMax; }

    public void setPeriodMax(int periodMax) { this.periodMax = periodMax; }

    public int getFrequency() { return frequency; }

    public void setFrequency(int frequency) { this.frequency = frequency; }

    public int getPeriod() { return period; }

    public void setPeriod(int period) { this.period = period; }

    public String getPeriodUnit() { return periodUnit; }

    public void setPeriodUnit(String periodUnit) { this.periodUnit = periodUnit; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}


