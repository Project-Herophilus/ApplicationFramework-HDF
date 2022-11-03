package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Repeat {
    public int frequency;
    public int period;
    public String periodUnit;
    public BoundsPeriod boundsPeriod;
    public int duration;
    public String durationUnit;

    public int getDuration() { return duration; }

    public void setDuration(int duration) { this.duration = duration; }

    public String getDurationUnit() { return durationUnit; }

    public void setDurationUnit(String durationUnit) { this.durationUnit = durationUnit; }

    public BoundsPeriod getBoundsPeriod() { return boundsPeriod; }

    public void setBoundsPeriod(BoundsPeriod boundsPeriod) { this.boundsPeriod = boundsPeriod; }

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
