package com.ibm.pojo.MedicationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Ingredient {
    public ItemReference itemReference;
    public Strength strength;
    public ItemCodeableConcept itemCodeableConcept;
    public boolean isActive;

    public boolean isActive() { return isActive; }

    public void setActive(boolean active) { isActive = active; }

    public ItemCodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

    public void setItemCodeableConcept(ItemCodeableConcept itemCodeableConcept) { this.itemCodeableConcept = itemCodeableConcept; }

    public ItemReference getItemReference() { return itemReference; }

    public void setItemReference(ItemReference itemReference) { this.itemReference = itemReference; }

    public Strength getStrength() { return strength; }

    public void setStrength(Strength strength) { this.strength = strength; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
