package com.ibm.pojo.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class Reaction {
    public Date date;
    public String reference;
    public boolean reported;

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public boolean isReported() { return reported; }

    public void setReported(boolean reported) { this.reported = reported; }

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
