package com.ibm.pojo.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class ProtocolApplied {
    public String series;
    public List<TargetDisease> targetDisease;
    public int doseNumberPositiveInt;

    public int getDoseNumberPositiveInt() { return doseNumberPositiveInt; }

    public void setDoseNumberPositiveInt(int doseNumberPositiveInt) { this.doseNumberPositiveInt = doseNumberPositiveInt; }

    public List<TargetDisease> getTargetDisease() { return targetDisease; }

    public void setTargetDisease(List<TargetDisease> targetDisease) { this.targetDisease = targetDisease; }

    public String getSeries() { return series; }

    public void setSeries(String series) { this.series = series; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
