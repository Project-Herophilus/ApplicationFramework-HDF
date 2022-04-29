package com.ibm.pojo.ClinicalImpressionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class EffectivePeriod {
    public Date start;
    public Date end;

    public Date getEnd() { return end; }

    public void setEnd(Date end) { this.end = end; }

    public Date getStart() { return start; }

    public void setStart(Date start) { this.start = start; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
