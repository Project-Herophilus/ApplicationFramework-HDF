package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Additive {
    public String display;
    public AdditiveCodeableConcept additiveCodeableConcept;
    public AdditiveReference additiveReference;

    public AdditiveReference getAdditiveReference() { return additiveReference; }

    public void setAdditiveReference(AdditiveReference additiveReference) { this.additiveReference = additiveReference; }

    public AdditiveCodeableConcept getAdditiveCodeableConcept() { return additiveCodeableConcept; }

    public void setAdditiveCodeableConcept(AdditiveCodeableConcept additiveCodeableConcept) { this.additiveCodeableConcept = additiveCodeableConcept; }

    public String getDisplay() { return display; }

    public void setDisplay(String display) { this.display = display; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
