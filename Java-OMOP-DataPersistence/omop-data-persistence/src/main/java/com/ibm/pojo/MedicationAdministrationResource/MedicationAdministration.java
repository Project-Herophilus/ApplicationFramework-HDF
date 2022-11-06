package com.ibm.pojo.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class MedicationAdministration {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public String status;
    public List<StatusReason> statusReason;
    public MedicationReference medicationReference;
    public Subject subject;
    public Context context;
    public List<SupportingInformation> supportingInformation;
    public EffectivePeriod effectivePeriod;
    public Request request;
    public List<Note> note;
    public List<Performer> performer;
    public List<ReasonCode> reasonCode;
    public Dosage dosage;
    public List<EventHistory> eventHistory;
    public List<PartOf> partOf;
    public Category category;
    public List<Device> device;
    public MedicationCodeableConcept medicationCodeableConcept;
    public List<Identifier> identifier;
    public String instantiates;

    public String getInstantiates() { return instantiates; }
    public void setInstantiates(String instantiates) { this.instantiates = instantiates; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public MedicationCodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }
    public void setMedicationCodeableConcept(MedicationCodeableConcept medicationCodeableConcept) { this.medicationCodeableConcept = medicationCodeableConcept; }

    public List<Device> getDevice() { return device; }
    public void setDevice(List<Device> device) { this.device = device; }

    public List<PartOf> getPartOf() { return partOf; }
    public void setPartOf(List<PartOf> partOf) { this.partOf = partOf; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public List<Performer> getPerformer() { return performer; }
    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public List<EventHistory> getEventHistory() { return eventHistory; }
    public void setEventHistory(List<EventHistory> eventHistory) { this.eventHistory = eventHistory; }

    public Dosage getDosage() { return dosage; }
    public void setDosage(Dosage dosage) { this.dosage = dosage; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public EffectivePeriod getEffectivePeriod() { return effectivePeriod; }
    public void setEffectivePeriod(EffectivePeriod effectivePeriod) { this.effectivePeriod = effectivePeriod; }

    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public MedicationReference getMedicationReference() { return medicationReference; }
    public void setMedicationReference(MedicationReference medicationReference) { this.medicationReference = medicationReference; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<StatusReason> getStatusReason() { return statusReason; }
    public void setStatusReason(List<StatusReason> statusReason) { this.statusReason = statusReason; }

    public List<SupportingInformation> getSupportingInformation() { return supportingInformation; }
    public void setSupportingInformation(List<SupportingInformation> supportingInformation) { this.supportingInformation = supportingInformation; }

    public Request getRequest() { return request; }
    public void setRequest(Request request) { this.request = request; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
