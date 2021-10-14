package com.ibm.pojo;

/*
 * https://www.hl7.org/fhir/adverseevent.html
 * Represents a FHIR AdverseEvent Resource
 * This will only contain fields
 * If other structures are referenced are used they can be populated directly
 * The intent is to use these libraries as DTO objects to populate and pass into building methods for simplicity
 *
 */

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AdverseEvent {
    public String AdverseEventIdentifier;
    public String AdverseEventActuality;
    public String AdverseEventDate;
    public String AdverseEventDetected;
    public String AdverseEventRecordedDate;
    public String AdverseEventSuspectEntityCausalityProductReadiness;
    public String GuarantorOnHold;
    public String GuarantorPeriod;

    // Getters and Setters

    public String getAdverseEventIdentifier() {
        return AdverseEventIdentifier;
    }

    public void setAdverseEventIdentifier(String adverseEventIdentifier) {
        AdverseEventIdentifier = adverseEventIdentifier;
    }

    public String getAdverseEventActuality() {
        return AdverseEventActuality;
    }

    public void setAdverseEventActuality(String adverseEventActuality) {
        AdverseEventActuality = adverseEventActuality;
    }

    public String getAdverseEventDate() {
        return AdverseEventDate;
    }

    public void setAdverseEventDate(String adverseEventDate) {
        AdverseEventDate = adverseEventDate;
    }

    public String getAdverseEventDetected() {
        return AdverseEventDetected;
    }

    public void setAdverseEventDetected(String adverseEventDetected) {
        AdverseEventDetected = adverseEventDetected;
    }

    public String getAdverseEventRecordedDate() {
        return AdverseEventRecordedDate;
    }

    public void setAdverseEventRecordedDate(String adverseEventRecordedDate) {
        AdverseEventRecordedDate = adverseEventRecordedDate;
    }

    public String getAdverseEventSuspectEntityCausalityProductReadiness() {
        return AdverseEventSuspectEntityCausalityProductReadiness;
    }

    public void setAdverseEventSuspectEntityCausalityProductReadiness(String adverseEventSuspectEntityCausalityProductReadiness) {
        AdverseEventSuspectEntityCausalityProductReadiness = adverseEventSuspectEntityCausalityProductReadiness;
    }

    public String getGuarantorOnHold() {
        return GuarantorOnHold;
    }

    public void setGuarantorOnHold(String guarantorOnHold) {
        GuarantorOnHold = guarantorOnHold;
    }

    public String getGuarantorPeriod() {
        return GuarantorPeriod;
    }

    public void setGuarantorPeriod(String guarantorPeriod) {
        GuarantorPeriod = guarantorPeriod;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
