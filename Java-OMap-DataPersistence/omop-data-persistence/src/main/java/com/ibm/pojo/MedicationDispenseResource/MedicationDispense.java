package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class MedicationDispense {

    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public String status;
    public MedicationReference medicationReference;
    public Subject subject;
    public List<Performer> performer;
    public List<AuthorizingPrescription> authorizingPrescription;
    public List<DosageInstruction> dosageInstruction;
    public List<SupportingInformation> supportingInformation;
    public Location location;
    public Type type;
    public Quantity quantity;
    public DaysSupply daysSupply;
    public Date whenPrepared;
    public Destination destination;
    public List<Receiver> receiver;
    public Date whenHandedOver;
    public List<PartOf> partOf;
    public StatusReasonReference statusReasonReference;
    public Category category;
    public Context context;
    public List<DetectedIssue> detectedIssue;
    public MedicationCodeableConcept medicationCodeableConcept;
    public Substitution substitution;
    public List<Note> note;

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public Substitution getSubstitution() { return substitution; }
    public void setSubstitution(Substitution substitution) { this.substitution = substitution; }

    public MedicationCodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }
    public void setMedicationCodeableConcept(MedicationCodeableConcept medicationCodeableConcept) { this.medicationCodeableConcept = medicationCodeableConcept; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public List<PartOf> getPartOf() { return partOf; }
    public void setPartOf(List<PartOf> partOf) { this.partOf = partOf; }

    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }

    public List<DetectedIssue> getDetectedIssue() { return detectedIssue; }
    public StatusReasonReference getStatusReasonReference() { return statusReasonReference; }

    public void setDetectedIssue(List<DetectedIssue> detectedIssue) { this.detectedIssue = detectedIssue; }
    public void setStatusReasonReference(StatusReasonReference statusReasonReference) { this.statusReasonReference = statusReasonReference; }

    public Date getWhenHandedOver() { return whenHandedOver; }
    public void setWhenHandedOver(Date whenHandedOver) { this.whenHandedOver = whenHandedOver; }

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public Quantity getQuantity() { return quantity; }
    public void setQuantity(Quantity quantity) { this.quantity = quantity; }

    public List<SupportingInformation> getSupportingInformation() { return supportingInformation; }
    public void setSupportingInformation(List<SupportingInformation> supportingInformation) { this.supportingInformation = supportingInformation; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public List<Receiver> getReceiver() { return receiver; }
    public void setReceiver(List<Receiver> receiver) { this.receiver = receiver; }

    public Destination getDestination() { return destination; }
    public void setDestination(Destination destination) { this.destination = destination; }

    public DaysSupply getDaysSupply() { return daysSupply; }
    public void setDaysSupply(DaysSupply daysSupply) { this.daysSupply = daysSupply; }

    public Date getWhenPrepared() { return whenPrepared; }
    public void setWhenPrepared(Date whenPrepared) { this.whenPrepared = whenPrepared; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<AuthorizingPrescription> getAuthorizingPrescription() { return authorizingPrescription; }
    public void setAuthorizingPrescription(List<AuthorizingPrescription> authorizingPrescription) { this.authorizingPrescription = authorizingPrescription; }

    public MedicationReference getMedicationReference() { return medicationReference; }
    public void setMedicationReference(MedicationReference medicationReference) { this.medicationReference = medicationReference; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public List<DosageInstruction> getDosageInstruction() { return dosageInstruction; }
    public void setDosageInstruction(List<DosageInstruction> dosageInstruction) { this.dosageInstruction = dosageInstruction; }

    public List<Performer> getPerformer() { return performer; }
    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
