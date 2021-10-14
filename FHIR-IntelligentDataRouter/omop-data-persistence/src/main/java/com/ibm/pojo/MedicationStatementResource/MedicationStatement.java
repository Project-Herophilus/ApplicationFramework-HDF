package com.ibm.pojo.MedicationStatementResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class MedicationStatement {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public String status;
    public Category category;
    public MedicationReference medicationReference;
    public Subject subject;
    public String effectiveDateTime;
    public String dateAsserted;
    public InformationSource informationSource;
    public List<DerivedFrom> derivedFrom;
    public List<ReasonCode> reasonCode;
    public List<Note> note;
    public List<Dosage> dosage;
    public List<StatusReason> statusReason;
    public List<PartOf> partOf;
    public MedicationCodeableConcept medicationCodeableConcept;
    public List<BasedOn> basedOn;
    public Context context;
    public List<ReasonReference> reasonReference;

    public List<ReasonReference> getReasonReference() { return reasonReference; }
    public void setReasonReference(List<ReasonReference> reasonReference) { this.reasonReference = reasonReference; }

    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }

    public List<BasedOn> getBasedOn() { return basedOn; }
    public void setBasedOn(List<BasedOn> basedOn) { this.basedOn = basedOn; }

    public List<PartOf> getPartOf() { return partOf; }
    public void setPartOf(List<PartOf> partOf) { this.partOf = partOf; }

    public MedicationCodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }
    public void setMedicationCodeableConcept(MedicationCodeableConcept medicationCodeableConcept) { this.medicationCodeableConcept = medicationCodeableConcept; }

    public List<StatusReason> getStatusReason() { return statusReason; }
    public void setStatusReason(List<StatusReason> statusReason) { this.statusReason = statusReason; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<DerivedFrom> getDerivedFrom() { return derivedFrom; }
    public void setDerivedFrom(List<DerivedFrom> derivedFrom) { this.derivedFrom = derivedFrom; }

    public List<Dosage> getDosage() { return dosage; }
    public void setDosage(List<Dosage> dosage) { this.dosage = dosage; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public String getDateAsserted() { return dateAsserted; }
    public void setDateAsserted(String dateAsserted) { this.dateAsserted = dateAsserted; }

    public String getEffectiveDateTime() { return effectiveDateTime; }
    public void setEffectiveDateTime(String effectiveDateTime) { this.effectiveDateTime = effectiveDateTime; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public MedicationReference getMedicationReference() { return medicationReference; }
    public void setMedicationReference(MedicationReference medicationReference) { this.medicationReference = medicationReference; }

    public InformationSource getInformationSource() { return informationSource; }
    public void setInformationSource(InformationSource informationSource) { this.informationSource = informationSource; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
