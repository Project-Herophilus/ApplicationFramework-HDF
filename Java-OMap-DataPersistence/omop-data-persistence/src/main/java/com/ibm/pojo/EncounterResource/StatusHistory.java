package com.ibm.pojo.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class StatusHistory {
    public String status;
    public Period period;

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
