package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ValueRange {
    public Low low;
    public High high;

    public Low getLow(){return low;}
    public void setLow(Low low){this.low=low;}

    public High getHigh(){return high;}
    public void setHigh(High high){this.high=high;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
