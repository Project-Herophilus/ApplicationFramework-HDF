package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Repeat {
    public int duration;
    public int durationMax;
    public String durationUnit;
    public int frequency;
    public int frequencyMax;
    public int period;
    public String periodUnit;
    public int count;
    public int countMax;

    public int getCount() { return count; }

    public void setCount(int count) { this.count = count; }

    public int getCountMax() { return countMax; }

    public void setCountMax(int countMax) { this.countMax = countMax; }

    public int getDuration() { return duration; }

    public void setDuration(int duration) { this.duration = duration; }

    public int getDurationMax() { return durationMax; }

    public void setDurationMax(int durationMax) { this.durationMax = durationMax; }

    public int getFrequency() { return frequency; }

    public void setFrequency(int frequency) { this.frequency = frequency; }

    public int getFrequencyMax() { return frequencyMax; }

    public void setFrequencyMax(int frequencyMax) { this.frequencyMax = frequencyMax; }

    public int getPeriod() { return period; }

    public void setPeriod(int period) { this.period = period; }

    public String getDurationUnit() { return durationUnit; }

    public void setDurationUnit(String durationUnit) { this.durationUnit = durationUnit; }

    public String getPeriodUnit() { return periodUnit; }

    public void setPeriodUnit(String periodUnit) { this.periodUnit = periodUnit; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
