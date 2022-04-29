package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Repeat {
    public int frequency;
    public int period;
    public String periodUnit;

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
