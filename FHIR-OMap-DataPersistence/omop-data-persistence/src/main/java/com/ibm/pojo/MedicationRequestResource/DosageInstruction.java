package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class DosageInstruction {
    public int sequence;
    public String text;
    public List<AdditionalInstruction> additionalInstruction;
    public Timing timing;
    public Route route;
    public Method method;
    public List<DoseAndRate> doseAndRate;
    public String patientInstruction;
    public AsNeededCodeableConcept asNeededCodeableConcept;
    public MaxDosePerAdministration maxDosePerAdministration;
    public MaxDosePerLifetime maxDosePerLifetime;

    public MaxDosePerLifetime getMaxDosePerLifetime() { return maxDosePerLifetime; }

    public void setMaxDosePerLifetime(MaxDosePerLifetime maxDosePerLifetime) { this.maxDosePerLifetime = maxDosePerLifetime; }

    public MaxDosePerAdministration getMaxDosePerAdministration() { return maxDosePerAdministration; }
    public void setMaxDosePerAdministration(MaxDosePerAdministration maxDosePerAdministration) { this.maxDosePerAdministration = maxDosePerAdministration; }

    public String getPatientInstruction() { return patientInstruction; }

    public void setPatientInstruction(String patientInstruction) { this.patientInstruction = patientInstruction; }

    public AsNeededCodeableConcept getAsNeededCodeableConcept() { return asNeededCodeableConcept; }

    public void setAsNeededCodeableConcept(AsNeededCodeableConcept asNeededCodeableConcept) { this.asNeededCodeableConcept = asNeededCodeableConcept; }

    public List<AdditionalInstruction> getAdditionalInstruction() { return additionalInstruction; }

    public void setAdditionalInstruction(List<AdditionalInstruction> additionalInstruction) { this.additionalInstruction = additionalInstruction; }

    public List<DoseAndRate> getDoseAndRate() { return doseAndRate; }

    public void setDoseAndRate(List<DoseAndRate> doseAndRate) { this.doseAndRate = doseAndRate; }

    public Method getMethod() { return method; }

    public void setMethod(Method method) { this.method = method; }

    public Route getRoute() { return route; }

    public void setRoute(Route route) { this.route = route; }

    public Timing getTiming() { return timing; }

    public void setTiming(Timing timing) { this.timing = timing; }

    public int getSequence() { return sequence; }

    public void setSequence(int sequence) { this.sequence = sequence; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
