package com.ibm.pojo.PractitionerRoleResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class AvailableTime {
    public List<String> daysOfWeek;
    public boolean allDay;


    public List<String> getDaysOfWeek(){return daysOfWeek;}
    public void setDaysOfWeek(List<String> daysOfWeek){this.daysOfWeek=daysOfWeek;}
    public boolean isAllDay(){return allDay;}
    public void setAllDay(boolean allDay) {this.allDay=allDay;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
