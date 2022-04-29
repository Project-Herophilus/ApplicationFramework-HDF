package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class Collection {
    public Collector collector;
    public Date collectedDateTime;
    public Quantity quantity;
    public Method method;
    public BodySite bodySite;
    public FastingStatus fastingStatus;

    public FastingStatus getFastingStatus() { return fastingStatus; }

    public void setFastingStatus(FastingStatus fastingStatus) { this.fastingStatus = fastingStatus; }

    public Collector getCollector() { return collector; }

    public void setCollector(Collector collector) { this.collector = collector; }

    public BodySite getBodySite() { return bodySite; }

    public void setBodySite(BodySite bodySite) { this.bodySite = bodySite; }

    public Date getCollectedDateTime() { return collectedDateTime; }

    public void setCollectedDateTime(Date collectedDateTime) { this.collectedDateTime = collectedDateTime; }

    public Method getMethod() { return method; }

    public void setMethod(Method method) { this.method = method; }

    public Quantity getQuantity() { return quantity; }

    public void setQuantity(Quantity quantity) { this.quantity = quantity; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
