package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Contained {
    public String resourceType;
    public String id;
    public String status;
    public Code code;
    public Subject subject;
    public ValueCodeableConcept valueCodeableConcept;
    public List<Identifier> identifier;
    public Type type;
    public Collection collection;
    public List<Target> target;
    public Date recorded;
    public List<Agent> agent;
    public List<Signature> signature;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public List<Category> category;
    public Severity severity;
    public String onsetDateTime;

    public ClinicalStatus getClinicalStatus() { return clinicalStatus; }

    public void setClinicalStatus(ClinicalStatus clinicalStatus) { this.clinicalStatus = clinicalStatus; }

    public Date getRecorded() { return recorded; }

    public void setRecorded(Date recorded) { this.recorded = recorded; }

    public List<Agent> getAgent() { return agent; }

    public void setAgent(List<Agent> agent) { this.agent = agent; }

    public List<Category> getCategory() { return category; }

    public void setCategory(List<Category> category) { this.category = category; }

    public List<Signature> getSignature() { return signature; }

    public void setSignature(List<Signature> signature) { this.signature = signature; }

    public List<Target> getTarget() { return target; }

    public void setTarget(List<Target> target) { this.target = target; }

    public Severity getSeverity() { return severity; }

    public void setSeverity(Severity severity) { this.severity = severity; }

    public String getOnsetDateTime() { return onsetDateTime; }

    public void setOnsetDateTime(String onsetDateTime) { this.onsetDateTime = onsetDateTime; }

    public VerificationStatus getVerificationStatus() { return verificationStatus; }

    public void setVerificationStatus(VerificationStatus verificationStatus) { this.verificationStatus = verificationStatus; }

    public Subject getSubject() { return subject; }

    public void setSubject(Subject subject) { this.subject = subject; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public List<Identifier> getIdentifier() { return identifier; }

    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public Collection getCollection() { return collection; }

    public void setCollection(Collection collection) { this.collection = collection; }

    public ValueCodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) { this.valueCodeableConcept = valueCodeableConcept; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
