package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RateRange {
    public Low low;
    public High high;

    public High getHigh() { return high; }

    public void setHigh(High high) { this.high = high; }

    public Low getLow() { return low; }

    public void setLow(Low low) { this.low = low; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
