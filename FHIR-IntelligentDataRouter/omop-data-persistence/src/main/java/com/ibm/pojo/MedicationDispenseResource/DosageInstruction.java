package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class DosageInstruction {
    public int sequence;
    public Timing timing;
    public Route route;
    public List<DoseAndRate> doseAndRate;
    public Method method;
    public List<AdditionalInstruction> additionalInstruction;
    public String text;
    public Site site;
    public AsNeededCodeableConcept asNeededCodeableConcept;
    public MaxDosePerPeriod maxDosePerPeriod;

    public MaxDosePerPeriod getMaxDosePerPeriod() { return maxDosePerPeriod; }

    public void setMaxDosePerPeriod(MaxDosePerPeriod maxDosePerPeriod) { this.maxDosePerPeriod = maxDosePerPeriod; }

    public AsNeededCodeableConcept getAsNeededCodeableConcept() { return asNeededCodeableConcept; }

    public void setAsNeededCodeableConcept(AsNeededCodeableConcept asNeededCodeableConcept) { this.asNeededCodeableConcept = asNeededCodeableConcept; }

    public Site getSite() { return site; }

    public void setSite(Site site) { this.site = site; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public List<AdditionalInstruction> getAdditionalInstruction() { return additionalInstruction; }

    public void setAdditionalInstruction(List<AdditionalInstruction> additionalInstruction) { this.additionalInstruction = additionalInstruction; }

    public Method getMethod() { return method; }

    public void setMethod(Method method) { this.method = method; }

    public int getSequence() { return sequence; }

    public void setSequence(int sequence) { this.sequence = sequence; }

    public List<DoseAndRate> getDoseAndRate() { return doseAndRate; }

    public void setDoseAndRate(List<DoseAndRate> doseAndRate) { this.doseAndRate = doseAndRate; }

    public Route getRoute() { return route; }

    public void setRoute(Route route) { this.route = route; }

    public Timing getTiming() { return timing; }

    public void setTiming(Timing timing) { this.timing = timing; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
