package com.ibm.pojo.ImmunizationEvaluationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class ImmunizationEvaluation {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public Patient patient;
    public String date;
    public Authority authority;
    public TargetDisease targetDisease;
    public ImmunizationEvent immunizationEvent;
    public DoseStatus doseStatus;
    public String series;
    public int doseNumberPositiveInt;
    public int seriesDosesPositiveInt;
    public List<DoseStatusReason> doseStatusReason;
    public String description;

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<DoseStatusReason> getDoseStatusReason() { return doseStatusReason; }
    public void setDoseStatusReason(List<DoseStatusReason> doseStatusReason) { this.doseStatusReason = doseStatusReason; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public ImmunizationEvent getImmunizationEvent() { return immunizationEvent; }
    public void setImmunizationEvent(ImmunizationEvent immunizationEvent) { this.immunizationEvent = immunizationEvent; }

    public Authority getAuthority() { return authority; }
    public void setAuthority(Authority authority) { this.authority = authority; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public DoseStatus getDoseStatus() { return doseStatus; }
    public void setDoseStatus(DoseStatus doseStatus) { this.doseStatus = doseStatus; }

    public int getDoseNumberPositiveInt() { return doseNumberPositiveInt; }
    public void setDoseNumberPositiveInt(int doseNumberPositiveInt) { this.doseNumberPositiveInt = doseNumberPositiveInt; }

    public int getSeriesDosesPositiveInt() { return seriesDosesPositiveInt; }
    public void setSeriesDosesPositiveInt(int seriesDosesPositiveInt) { this.seriesDosesPositiveInt = seriesDosesPositiveInt; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public String getSeries() { return series; }
    public void setSeries(String series) { this.series = series; }

    public TargetDisease getTargetDisease() { return targetDisease; }
    public void setTargetDisease(TargetDisease targetDisease) { this.targetDisease = targetDisease; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
