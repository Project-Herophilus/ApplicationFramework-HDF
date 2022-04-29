package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Other {

    public String reference;

    public String getReference(){return reference;}
    public void setReference(String  reference){this.reference=reference;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
