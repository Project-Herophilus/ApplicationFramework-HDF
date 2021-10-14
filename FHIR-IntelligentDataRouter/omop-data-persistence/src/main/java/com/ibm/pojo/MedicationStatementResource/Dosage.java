package com.ibm.pojo.MedicationStatementResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Dosage {
    public int sequence;
    public String text;
    public List<AdditionalInstruction> additionalInstruction;
    public Timing timing;
    public AsNeededCodeableConcept asNeededCodeableConcept;
    public Route route;
    public List<DoseAndRate> doseAndRate;
    public boolean asNeededBoolean;
    public MaxDosePerPeriod maxDosePerPeriod;

    public boolean isAsNeededBoolean() { return asNeededBoolean; }

    public void setAsNeededBoolean(boolean asNeededBoolean) { this.asNeededBoolean = asNeededBoolean; }

    public MaxDosePerPeriod getMaxDosePerPeriod() { return maxDosePerPeriod; }

    public void setMaxDosePerPeriod(MaxDosePerPeriod maxDosePerPeriod) { this.maxDosePerPeriod = maxDosePerPeriod; }

    public AsNeededCodeableConcept getAsNeededCodeableConcept() { return asNeededCodeableConcept; }

    public void setAsNeededCodeableConcept(AsNeededCodeableConcept asNeededCodeableConcept) { this.asNeededCodeableConcept = asNeededCodeableConcept; }

    public List<AdditionalInstruction> getAdditionalInstruction() { return additionalInstruction; }

    public void setAdditionalInstruction(List<AdditionalInstruction> additionalInstruction){ this.additionalInstruction = additionalInstruction; }

    public int getSequence() { return sequence; }

    public void setSequence(int sequence) { this.sequence = sequence; }

    public List<DoseAndRate> getDoseAndRate() { return doseAndRate; }

    public void setDoseAndRate(List<DoseAndRate> doseAndRate) { this.doseAndRate = doseAndRate; }

    public Route getRoute() { return route; }

    public void setRoute(Route route) { this.route = route; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public Timing getTiming() { return timing; }

    public void setTiming(Timing timing) { this.timing = timing; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
