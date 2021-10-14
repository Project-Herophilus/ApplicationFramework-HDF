package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BoundsPeriod {
    public String start;
    public String end;

    public String getEnd() { return end; }

    public void setEnd(String end) { this.end = end; }

    public String getStart() { return start; }

    public void setStart(String start) { this.start = start; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
