package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class PatientCharacteristics {
    public String value;
    public CharacteristicCodeableConcept characteristicCodeableConcept;

    public CharacteristicCodeableConcept getCharacteristicCodeableConcept() { return characteristicCodeableConcept; }

    public void setCharacteristicCodeableConcept(CharacteristicCodeableConcept characteristicCodeableConcept) { this.characteristicCodeableConcept = characteristicCodeableConcept; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
