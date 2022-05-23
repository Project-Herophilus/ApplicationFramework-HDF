package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Activity {

    public List<OutcomeCodeableConcept> outcomeCodeableConcepts;
    public List<OutcomeReference> outcomeReferences;
    public Detail detail;

    public List<OutcomeCodeableConcept> getOutcomeCodeableConcepts() { return outcomeCodeableConcepts; }

    public void setOutcomeCodeableConcepts(List<OutcomeCodeableConcept> outcomeCodeableConcepts) { this.outcomeCodeableConcepts = outcomeCodeableConcepts; }

    public List<OutcomeReference> getOutcomeReferences() { return outcomeReferences; }

    public void setOutcomeReferences(List<OutcomeReference> outcomeReferences) { this.outcomeReferences = outcomeReferences; }

    public Detail getDetail() { return detail; }

    public void setDetail(Detail detail) { this.detail = detail; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
