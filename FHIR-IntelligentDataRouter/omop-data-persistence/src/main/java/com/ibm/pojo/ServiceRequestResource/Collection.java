package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class Collection {
    public Date collectedDateTime;

    public Date getCollectedDateTime() { return collectedDateTime; }

    public void setCollectedDateTime(Date collectedDateTime) { this.collectedDateTime = collectedDateTime; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
