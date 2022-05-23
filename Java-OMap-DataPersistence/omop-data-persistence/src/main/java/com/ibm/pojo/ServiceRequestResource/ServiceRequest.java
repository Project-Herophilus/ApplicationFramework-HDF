package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class ServiceRequest {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public String status;
    public String intent;
    public Code code;
    public Subject subject;
    public Encounter encounter;
    public Date occurrenceDateTime;
    public Requester requester;
    public List<Performer> performer;
    public List<ReasonCode> reasonCode;
    public List<SupportingInfo> supportingInfo;
    public List<Speciman> specimen;
    public List<Note> note;
    public List<Category> category;
    public List<BasedOn> basedOn;
    public List<Replace> replaces;
    public Requisition requisition;
    public String priority;
    public PerformerType performerType;
    public List<BodySite> bodySite;
    public OccurrenceTiming occurrenceTiming;
    public AsNeededCodeableConcept asNeededCodeableConcept;
    public Date authoredOn;
    public List<ReasonReference> reasonReference;
    public List<RelevantHistory> relevantHistory;
    public String patientInstruction;
    public OccurrencePeriod occurrencePeriod;
    public List<OrderDetail> orderDetail;


    public List<OrderDetail> getOrderDetail() { return orderDetail; }
    public void setOrderDetail(List<OrderDetail> orderDetail) { this.orderDetail = orderDetail; }

    public OccurrencePeriod getOccurrencePeriod() { return occurrencePeriod; }
    public void setOccurrencePeriod(OccurrencePeriod occurrencePeriod) { this.occurrencePeriod = occurrencePeriod; }

    public String getPatientInstruction() { return patientInstruction; }
    public void setPatientInstruction(String patientInstruction) { this.patientInstruction = patientInstruction; }

    public AsNeededCodeableConcept getAsNeededCodeableConcept() { return asNeededCodeableConcept; }
    public void setAsNeededCodeableConcept(AsNeededCodeableConcept asNeededCodeableConcept) { this.asNeededCodeableConcept = asNeededCodeableConcept; }

    public Date getAuthoredOn() { return authoredOn; }
    public void setAuthoredOn(Date authoredOn) { this.authoredOn = authoredOn; }

    public List<ReasonReference> getReasonReference() { return reasonReference; }
    public void setReasonReference(List<ReasonReference> reasonReference) { this.reasonReference = reasonReference; }

    public OccurrenceTiming getOccurrenceTiming() { return occurrenceTiming; }
    public void setOccurrenceTiming(OccurrenceTiming occurrenceTiming) { this.occurrenceTiming = occurrenceTiming; }

    public List<RelevantHistory> getRelevantHistory() { return relevantHistory; }
    public void setRelevantHistory(List<RelevantHistory> relevantHistory) { this.relevantHistory = relevantHistory; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public Requisition getRequisition() { return requisition; }
    public void setRequisition(Requisition requisition) { this.requisition = requisition; }

    public PerformerType getPerformerType() { return performerType; }
    public void setPerformerType(PerformerType performerType) { this.performerType = performerType; }

    public List<BodySite> getBodySite() { return bodySite; }
    public void setBodySite(List<BodySite> bodySite) { this.bodySite = bodySite; }

    public List<BasedOn> getBasedOn() { return basedOn; }
    public void setBasedOn(List<BasedOn> basedOn) { this.basedOn = basedOn; }

    public List<Replace> getReplaces() { return replaces; }
    public void setReplaces(List<Replace> replaces) { this.replaces = replaces; }

    public List<Category> getCategory() { return category; }
    public void setCategory(List<Category> category) { this.category = category; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Code getCode() { return code; }
    public void setCode(Code code) { this.code = code; }

    public Date getOccurrenceDateTime() { return occurrenceDateTime; }
    public void setOccurrenceDateTime(Date occurrenceDateTime) { this.occurrenceDateTime = occurrenceDateTime; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<Performer> getPerformer() { return performer; }
    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public Requester getRequester() { return requester; }
    public void setRequester(Requester requester) { this.requester = requester; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public List<Speciman> getSpecimen() { return specimen; }
    public void setSpecimen(List<Speciman> specimen) { this.specimen = specimen; }

    public List<SupportingInfo> getSupportingInfo() { return supportingInfo; }
    public void setSupportingInfo(List<SupportingInfo> supportingInfo) { this.supportingInfo = supportingInfo; }

    public String getIntent() { return intent; }
    public void setIntent(String intent) { this.intent = intent; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
