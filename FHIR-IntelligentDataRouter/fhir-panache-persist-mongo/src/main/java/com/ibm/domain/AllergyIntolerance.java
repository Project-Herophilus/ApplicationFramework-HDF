package com.ibm.domain;

import java.util.Date;
import java.util.List;

public class AllergyIntolerance {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public String type;
    public List<String> category;
    public String criticality;
    public Code code;
    public Patient patient;
    public Date recordedDate;
    public Recorder recorder;
    public Asserter asserter;
    public String lastOccurrence;
    public List<Note> note;
    public List<Reaction> reaction;

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

    public ClinicalStatus getClinicalStatus() {
        return clinicalStatus;
    }

    public void setClinicalStatus(ClinicalStatus clinicalStatus) {
        this.clinicalStatus = clinicalStatus;
    }

    public VerificationStatus getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(Date recordedDate) {
        this.recordedDate = recordedDate;
    }

    public Recorder getRecorder() {
        return recorder;
    }

    public void setRecorder(Recorder recorder) {
        this.recorder = recorder;
    }

    public Asserter getAsserter() {
        return asserter;
    }

    public void setAsserter(Asserter asserter) {
        this.asserter = asserter;
    }

    public String getLastOccurrence() {
        return lastOccurrence;
    }

    public void setLastOccurrence(String lastOccurrence) {
        this.lastOccurrence = lastOccurrence;
    }

    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    public List<Reaction> getReaction() {
        return reaction;
    }

    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }
}