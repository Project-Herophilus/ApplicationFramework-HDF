package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class AdministrationGuidelines {
    public Dosage dosage;
    public IndicationCodeableConcept indicationCodeableConcept;
    public PatientCharacteristics patientCharacteristics;

    public Dosage getDosage() { return dosage; }

    public void setDosage(Dosage dosage) { this.dosage = dosage; }

    public IndicationCodeableConcept getIndicationCodeableConcept() { return indicationCodeableConcept; }

    public void setIndicationCodeableConcept(IndicationCodeableConcept indicationCodeableConcept) { this.indicationCodeableConcept = indicationCodeableConcept; }

    public PatientCharacteristics getPatientCharacteristics() { return patientCharacteristics; }

    public void setPatientCharacteristics(PatientCharacteristics patientCharacteristics) { this.patientCharacteristics = patientCharacteristics; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
