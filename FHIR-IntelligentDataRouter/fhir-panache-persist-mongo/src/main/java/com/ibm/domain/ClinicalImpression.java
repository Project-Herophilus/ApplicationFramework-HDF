package com.ibm.domain;

import java.util.Date;
import java.util.List;

public class ClinicalImpression {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public String description;
    public Subject subject;
    public Encounter encounter;
    public EffectivePeriod effectivePeriod;
    public Date date;
    public Assessor assessor;
    public List<Problem> problem;
    public List<Investigation> investigation;
    public String summary;
    public List<Finding> finding;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public EffectivePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    public void setEffectivePeriod(EffectivePeriod effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Assessor getAssessor() {
        return assessor;
    }

    public void setAssessor(Assessor assessor) {
        this.assessor = assessor;
    }

    public List<Problem> getProblem() {
        return problem;
    }

    public void setProblem(List<Problem> problem) {
        this.problem = problem;
    }

    public List<Investigation> getInvestigation() {
        return investigation;
    }

    public void setInvestigation(List<Investigation> investigation) {
        this.investigation = investigation;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Finding> getFinding() {
        return finding;
    }

    public void setFinding(List<Finding> finding) {
        this.finding = finding;
    }
}
