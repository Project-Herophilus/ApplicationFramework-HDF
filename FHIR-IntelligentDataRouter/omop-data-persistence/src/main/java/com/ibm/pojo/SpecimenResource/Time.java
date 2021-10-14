package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;


public class Time {
    public Date timeDateTime;
    public String timePeriod;

    public Date getTimeDateTime() { return timeDateTime; }

    public void setTimeDateTime(Date timeDateTime) { this.timeDateTime = timeDateTime; }

    public String getTimePeriod() { return timePeriod; }

    public void setTimePeriod(String timePeriod) { this.timePeriod = timePeriod; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
