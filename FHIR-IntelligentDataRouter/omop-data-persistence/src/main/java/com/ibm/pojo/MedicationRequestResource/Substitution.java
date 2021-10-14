package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Substitution {
    public boolean allowedBoolean;
    public Reason reason;
    public AllowedCodeableConcept allowedCodeableConcept;

    public AllowedCodeableConcept getAllowedCodeableConcept() { return allowedCodeableConcept; }

    public void setAllowedCodeableConcept(AllowedCodeableConcept allowedCodeableConcept) { this.allowedCodeableConcept = allowedCodeableConcept; }

    public boolean isAllowedBoolean() { return allowedBoolean; }

    public void setAllowedBoolean(boolean allowedBoolean) { this.allowedBoolean = allowedBoolean; }

    public Reason getReason() { return reason; }

    public void setReason(Reason reason) { this.reason = reason; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
