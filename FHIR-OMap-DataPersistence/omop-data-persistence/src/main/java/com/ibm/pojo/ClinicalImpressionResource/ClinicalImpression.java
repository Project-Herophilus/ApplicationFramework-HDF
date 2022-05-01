package com.ibm.pojo.ClinicalImpressionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class ClinicalImpression {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public String statusReason;
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
    public String prognosisReference;
    public SupportingInfo supportingInfo;

    public SupportingInfo getSupportingInfo() { return supportingInfo; }
    public void setSupportingInfo(SupportingInfo supportingInfo) { this.supportingInfo = supportingInfo; }

    public String getPrognosisReference() { return prognosisReference; }
    public void setPrognosisReference(String prognosisReference) { this.prognosisReference = prognosisReference; }

    public String getStatusReason() { return statusReason; }
    public void setStatusReason(String statusReason) { this.statusReason = statusReason; }

    public Assessor getAssessor() { return assessor; }
    public void setAssessor(Assessor assessor) { this.assessor = assessor; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public EffectivePeriod getEffectivePeriod() { return effectivePeriod; }
    public void setEffectivePeriod(EffectivePeriod effectivePeriod) { this.effectivePeriod = effectivePeriod; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public List<Finding> getFinding() { return finding; }
    public void setFinding(List<Finding> finding) { this.finding = finding; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public List<Investigation> getInvestigation() { return investigation; }
    public void setInvestigation(List<Investigation> investigation) { this.investigation = investigation; }

    public List<Problem> getProblem() { return problem; }
    public void setProblem(List<Problem> problem) { this.problem = problem; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
