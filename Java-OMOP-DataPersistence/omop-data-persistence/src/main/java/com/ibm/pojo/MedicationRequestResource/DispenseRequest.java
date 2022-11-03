package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DispenseRequest {
    public ValidityPeriod validityPeriod;
    public int numberOfRepeatsAllowed;
    public Quantity quantity;
    public ExpectedSupplyDuration expectedSupplyDuration;
    public Performer performer;

    public Performer getPerformer() { return performer; }

    public void setPerformer(Performer performer) { this.performer = performer; }

    public ExpectedSupplyDuration getExpectedSupplyDuration() { return expectedSupplyDuration; }

    public void setExpectedSupplyDuration(ExpectedSupplyDuration expectedSupplyDuration) { this.expectedSupplyDuration = expectedSupplyDuration; }

    public int getNumberOfRepeatsAllowed() { return numberOfRepeatsAllowed; }

    public void setNumberOfRepeatsAllowed(int numberOfRepeatsAllowed) { this.numberOfRepeatsAllowed = numberOfRepeatsAllowed; }

    public Quantity getQuantity() { return quantity; }

    public void setQuantity(Quantity quantity) { this.quantity = quantity; }

    public ValidityPeriod getValidityPeriod() { return validityPeriod; }

    public void setValidityPeriod(ValidityPeriod validityPeriod) { this.validityPeriod = validityPeriod; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}