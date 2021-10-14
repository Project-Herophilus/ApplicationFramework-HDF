package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ScheduledPeriod {

    public String start;

    public void setStart(String start) { this.start = start; }

    public String getStart() { return start; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
