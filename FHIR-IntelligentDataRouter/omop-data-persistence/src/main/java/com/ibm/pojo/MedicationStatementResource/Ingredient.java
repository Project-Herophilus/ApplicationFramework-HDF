package com.ibm.pojo.MedicationStatementResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Ingredient {
    public Strength strength;
    public ItemCodeableConcept itemCodeableConcept;

    public ItemCodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

    public void setItemCodeableConcept(ItemCodeableConcept itemCodeableConcept) { this.itemCodeableConcept = itemCodeableConcept; }

    public Strength getStrength() { return strength; }

    public void setStrength(Strength strength) { this.strength = strength; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
