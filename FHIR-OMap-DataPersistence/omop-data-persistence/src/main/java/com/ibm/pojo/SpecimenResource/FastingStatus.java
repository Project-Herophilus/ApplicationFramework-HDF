package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class FastingStatus {
    public FastingStatusCodeableConcept fastingStatusCodeableConcept;
    public String fastingStatusDuration;

    public FastingStatusCodeableConcept getFastingStatusCodeableConcept() { return fastingStatusCodeableConcept; }

    public void setFastingStatusCodeableConcept(FastingStatusCodeableConcept fastingStatusCodeableConcept) { this.fastingStatusCodeableConcept = fastingStatusCodeableConcept; }

    public String getFastingStatusDuration() { return fastingStatusDuration; }

    public void setFastingStatusDuration(String fastingStatusDuration) { this.fastingStatusDuration = fastingStatusDuration; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
