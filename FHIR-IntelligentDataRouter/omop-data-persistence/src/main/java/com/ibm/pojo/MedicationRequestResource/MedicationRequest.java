package com.ibm.pojo.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class MedicationRequest {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public String intent;
    public MedicationReference medicationReference;
    public Subject subject;
    public Encounter encounter;
    public String authoredOn;
    public Requester requester;
    public List<ReasonCode> reasonCode;
    public List<DosageInstruction> dosageInstruction;
    public List<Contained> contained;
    public List<SupportingInformation> supportingInformation;
    public List<Note> note;
    public DispenseRequest dispenseRequest;
    public Substitution substitution;
    public StatusReason statusReason;
    public List<Category> category;
    public Performer performer;
    public PerformerType performerType;
    public List<Insurance> insurance;
    public List<DetectedIssue> detectedIssue;
    public List<EventHistory> eventHistory;
    public List<BasedOn> basedOn;
    public GroupIdentifier groupIdentifier;
    public MedicationCodeableConcept medicationCodeableConcept;
    public Recorder recorder;
    public List<ReasonReference> reasonReference;
    public PriorPrescription priorPrescription;;

    public PriorPrescription getPriorPrescription() { return priorPrescription; }
    public void setPriorPrescription(PriorPrescription priorPrescription) { this.priorPrescription = priorPrescription; }

    public List<ReasonReference> getReasonReference() { return reasonReference; }
    public void setReasonReference(List<ReasonReference> reasonReference) { this.reasonReference = reasonReference; }

    public Recorder getRecorder() { return recorder; }
    public void setRecorder(Recorder recorder) { this.recorder = recorder; }

    public MedicationCodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }
    public void setMedicationCodeableConcept(MedicationCodeableConcept medicationCodeableConcept) { this.medicationCodeableConcept = medicationCodeableConcept; }

    public GroupIdentifier getGroupIdentifier() { return groupIdentifier; }
    public void setGroupIdentifier(GroupIdentifier groupIdentifier) { this.groupIdentifier = groupIdentifier; }

    public List<BasedOn> getBasedOn() { return basedOn; }
    public void setBasedOn(List<BasedOn> basedOn) { this.basedOn = basedOn; }

    public StatusReason getStatusReason() { return statusReason; }
    public void setStatusReason(StatusReason statusReason) { this.statusReason = statusReason; }

    public PerformerType getPerformerType() { return performerType; }
    public void setPerformerType(PerformerType performerType) { this.performerType = performerType; }

    public Performer getPerformer() { return performer; }
    public void setPerformer(Performer performer) { this.performer = performer; }

    public List<Insurance> getInsurance() { return insurance; }
    public void setInsurance(List<Insurance> insurance) { this.insurance = insurance; }

    public List<EventHistory> getEventHistory() { return eventHistory; }
    public void setEventHistory(List<EventHistory> eventHistory) { this.eventHistory = eventHistory; }

    public List<DetectedIssue> getDetectedIssue() { return detectedIssue; }
    public void setDetectedIssue(List<DetectedIssue> detectedIssue) { this.detectedIssue = detectedIssue; }

    public List<Category> getCategory() { return category; }
    public void setCategory(List<Category> category) { this.category = category; }

    public Substitution getSubstitution() { return substitution; }
    public void setSubstitution(Substitution substitution) { this.substitution = substitution; }

    public List<SupportingInformation> getSupportingInformation() { return supportingInformation; }
    public void setSupportingInformation(List<SupportingInformation> supportingInformation) { this.supportingInformation = supportingInformation; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public DispenseRequest getDispenseRequest() { return dispenseRequest; }
    public void setDispenseRequest(DispenseRequest dispenseRequest) { this.dispenseRequest = dispenseRequest; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public MedicationReference getMedicationReference() { return medicationReference; }
    public void setMedicationReference(MedicationReference medicationReference) { this.medicationReference = medicationReference; }

    public Requester getRequester() { return requester; }
    public void setRequester(Requester requester) { this.requester = requester; }

    public List<DosageInstruction> getDosageInstruction() { return dosageInstruction; }
    public void setDosageInstruction(List<DosageInstruction> dosageInstruction) { this.dosageInstruction = dosageInstruction; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public String getAuthoredOn() { return authoredOn; }
    public void setAuthoredOn(String authoredOn) { this.authoredOn = authoredOn; }

    public String getIntent() { return intent; }
    public void setIntent(String intent) { this.intent = intent; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
