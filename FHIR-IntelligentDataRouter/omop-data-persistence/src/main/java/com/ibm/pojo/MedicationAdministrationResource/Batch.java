package com.ibm.pojo.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Batch {
    public String lotNumber;
    public String expirationDate;

    public String getExpirationDate() { return expirationDate; }

    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    public String getLotNumber() { return lotNumber; }

    public void setLotNumber(String lotNumber) { this.lotNumber = lotNumber; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
