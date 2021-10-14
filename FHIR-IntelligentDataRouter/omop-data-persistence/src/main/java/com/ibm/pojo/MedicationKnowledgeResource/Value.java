package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Value {
    public ValueCodeableConcept valueCodeableConcept;
    public String valueString;
    public int valueQuantity;

    public int getValueQuantity() { return valueQuantity; }

    public void setValueQuantity(int valueQuantity) { this.valueQuantity = valueQuantity; }

    public String getValueString() { return valueString; }

    public void setValueString(String valueString) { this.valueString = valueString; }

    public ValueCodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) { this.valueCodeableConcept = valueCodeableConcept; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
