package com.ibm.pojo.ClinicalImpressionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Finding {
    public ItemCodeableConcept itemCodeableConcept;
    public String itemReference;
    public String basis;

    public String getBasis() { return basis; }

    public void setBasis(String basis) { this.basis = basis; }

    public String getItemReference() { return itemReference; }

    public void setItemReference(String itemReference) { this.itemReference = itemReference; }

    public ItemCodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

    public void setItemCodeableConcept(ItemCodeableConcept itemCodeableConcept) { this.itemCodeableConcept = itemCodeableConcept; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
