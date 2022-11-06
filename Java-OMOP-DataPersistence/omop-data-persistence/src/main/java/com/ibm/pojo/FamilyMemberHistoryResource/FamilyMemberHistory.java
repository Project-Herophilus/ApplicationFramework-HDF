package com.ibm.pojo.FamilyMemberHistoryResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class FamilyMemberHistory {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public List<String> instantiatesUri;
    public String status;
    public Patient patient;
    public String date;
    public Relationship relationship;
    public Sex sex;
    public List<Condition> condition;
    public Boolean estimatedAge;
    public ReasonCode reasonCode;
    public Outcome outcome;
    public Date bornDate;
    public int age;

    public Date getBornDate() { return bornDate; }
    public void setBornDate(Date bornDate) { this.bornDate = bornDate; }

    public Outcome getOutcome() { return outcome; }
    public void setOutcome(Outcome outcome) { this.outcome = outcome; }

    public ReasonCode getReasonCode() { return reasonCode; }
    public void setReasonCode(ReasonCode reasonCode) { this.reasonCode = reasonCode; }

    public Boolean getEstimatedAge() { return estimatedAge; }
    public void setEstimatedAge(Boolean estimatedAge) { this.estimatedAge = estimatedAge; }

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

    public List<Condition> getCondition() { return condition; }
    public void setCondition(List<Condition> condition) { this.condition = condition; }

    public List<String> getInstantiatesUri() { return instantiatesUri; }
    public void setInstantiatesUri(List<String> instantiatesUri) { this.instantiatesUri = instantiatesUri; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Relationship getRelationship() { return relationship; }
    public void setRelationship(Relationship relationship) { this.relationship = relationship; }

    public Sex getSex() { return sex; }
    public void setSex(Sex sex) { this.sex = sex; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
