package com.ibm.pojo.ConditionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Condition {
    public String resourceType;
    public String id;
    public Text text;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public List<Category> category;
    public Severity severity;
    public Type type;
    public Code code;
    public List<BodySite> bodySite;
    public Subject subject;
    public String onsetDateTime;
    public List<Identifier> identifier;
    public Encounter encounter;
    public String abatementString;
    public String recordedDate;
    public Recorder recorder;
    public Asserter asserter;
    public List<Evidence> evidence;
    public Meta meta;
    public OnsetAge onsetAge;
    public AbatementAge abatementAge;
    public String abatementDateTime;
    public List<Stage> stage;
    public List<Note> note;

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public String getAbatementDateTime() { return abatementDateTime; }
    public void setAbatementDateTime(String abatementDateTime) { this.abatementDateTime = abatementDateTime; }

    public List<Stage> getStage() { return stage; }
    public void setStage(List<Stage> stage) { this.stage = stage; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public AbatementAge getAbatementAge() { return abatementAge; }
    public void setAbatementAge(AbatementAge abatementAge) { this.abatementAge = abatementAge; }

    public Meta getMeta() { return meta; }
    public void setMeta(Meta meta) { this.meta = meta; }

    public OnsetAge getOnsetAge() { return onsetAge; }
    public void setOnsetAge(OnsetAge onsetAge) { this.onsetAge = onsetAge; }

    public String getRecordedDate() { return recordedDate; }
    public void setRecordedDate(String recordedDate) { this.recordedDate = recordedDate; }

    public String getAbatementString() { return abatementString; }
    public void setAbatementString(String abatementString) { this.abatementString = abatementString; }

    public Recorder getRecorder() { return recorder; }
    public void setRecorder(Recorder recorder) { this.recorder = recorder; }

    public List<Evidence> getEvidence() { return evidence; }
    public void setEvidence(List<Evidence> evidence) { this.evidence = evidence; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public Asserter getAsserter() { return asserter; }
    public void setAsserter(Asserter asserter) { this.asserter = asserter; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getOnsetDateTime() { return onsetDateTime; }
    public void setOnsetDateTime(String onsetDateTime) { this.onsetDateTime = onsetDateTime; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public ClinicalStatus getClinicalStatus() { return clinicalStatus; }
    public void setClinicalStatus(ClinicalStatus clinicalStatus) { this.clinicalStatus = clinicalStatus; }

    public Code getCode() { return code; }
    public void setCode(Code code) { this.code = code; }

    public List<BodySite> getBodySite() { return bodySite; }
    public void setBodySite(List<BodySite> bodySite) { this.bodySite = bodySite; }

    public List<Category> getCategory() { return category; }
    public void setCategory(List<Category> category) { this.category = category; }

    public Severity getSeverity() { return severity; }
    public void setSeverity(Severity severity) { this.severity = severity; }

    public VerificationStatus getVerificationStatus() { return verificationStatus; }
    public void setVerificationStatus(VerificationStatus verificationStatus) { this.verificationStatus = verificationStatus; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
