package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Item {
    public ItemCodeableConcept itemCodeableConcept;
    public ItemReference itemReference;

    public ItemCodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

    public void setItemCodeableConcept(ItemCodeableConcept itemCodeableConcept) { this.itemCodeableConcept = itemCodeableConcept; }

    public ItemReference getItemReference() { return itemReference; }

    public void setItemReference(ItemReference itemReference) { this.itemReference = itemReference; }


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
