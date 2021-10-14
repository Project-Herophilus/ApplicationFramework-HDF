package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OccurrencePeriod {
    public String end;

    public String getEnd() { return end; }

    public void setEnd(String end) { this.end = end; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
