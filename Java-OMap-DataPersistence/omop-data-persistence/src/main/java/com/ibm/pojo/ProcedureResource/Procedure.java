package com.ibm.pojo.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Procedure {
    public String resourceType;
    public String id;
    public Text text;
    public String status;
    public Code code;
    public Subject subject;
    public String performedDateTime;
    public Recorder recorder;
    public Asserter asserter;
    public Performer performer;
    public List<ReasonCode> reasonCode;
    public List<FollowUp> followUp;
    public List<Note> note;
    public Category category;
    public List<BodySite> bodySite;
    public List<Complication> complication;
    public List<UsedCode> usedCode;
    public Encounter encounter;
    public PerformedPeriod performedPeriod;
    public List<String> instantiatesCanonical;
    public Outcome outcome;
    public List<Report> report;
    public List<FocalDevice> focalDevice;
    public Location location;
    public List<ReasonReference> reasonReference;
    public List<Identifier> identifier;
    public List<String> instantiatesUri;
    public List<BasedOn> basedOn;
    public List<PartOf> partOf;
    public List<ComplicationDetail> complicationDetail;
    public List<UsedReference> usedReference;

    public List<ComplicationDetail> getComplicationDetail() { return complicationDetail; }
    public void setComplicationDetail(List<ComplicationDetail> complicationDetail) { this.complicationDetail = complicationDetail; }

    public List<UsedReference> getUsedReference() { return usedReference; }
    public void setUsedReference(List<UsedReference> usedReference) { this.usedReference = usedReference; }

    public List<PartOf> getPartOf() { return partOf; }
    public void setPartOf(List<PartOf> partOf) { this.partOf = partOf; }

    public List<String> getInstantiatesUri() { return instantiatesUri; }
    public void setInstantiatesUri(List<String> instantiatesUri) { this.instantiatesUri = instantiatesUri; }

    public List<BasedOn> getBasedOn() { return basedOn; }
    public void setBasedOn(List<BasedOn> basedOn) { this.basedOn = basedOn; }

    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }
    public List<Identifier> getIdentifier() { return identifier; }

    public List<ReasonReference> getReasonReference() { return reasonReference; }
    public void setReasonReference(List<ReasonReference> reasonReference) { this.reasonReference = reasonReference; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public List<FocalDevice> getFocalDevice() { return focalDevice; }
    public void setFocalDevice(List<FocalDevice> focalDevice) { this.focalDevice = focalDevice; }

    public List<Report> getReport() { return report; }
    public void setReport(List<Report> report) { this.report = report; }

    public Outcome getOutcome() { return outcome; }
    public void setOutcome(Outcome outcome) { this.outcome = outcome; }

    public List<String> getInstantiatesCanonical() { return instantiatesCanonical; }
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) { this.instantiatesCanonical = instantiatesCanonical; }

    public PerformedPeriod getPerformedPeriod() { return performedPeriod; }
    public void setPerformedPeriod(PerformedPeriod performedPeriod) { this.performedPeriod = performedPeriod; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public List<UsedCode> getUsedCode() { return usedCode; }
    public void setUsedCode(List<UsedCode> usedCode) { this.usedCode = usedCode; }

    public List<Complication> getComplication() { return complication; }
    public void setComplication(List<Complication> complication) { this.complication = complication; }

    public List<BodySite> getBodySite() { return bodySite; }
    public void setBodySite(List<BodySite> bodySite) { this.bodySite = bodySite; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Text getText() {return text;}
    public void setText(Text text){this.text=text;}

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Code getCode() { return code; }
    public void setCode(Code code) { this.code = code; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getPerformedDateTime() { return performedDateTime; }
    public void setPerformedDateTime(String performedDateTime) { this.performedDateTime = performedDateTime; }

    public Recorder getRecorder() { return recorder; }
    public void setRecorder(Recorder recorder) { this.recorder = recorder; }

    public Asserter getAsserter() { return asserter; }
    public void setAsserter(Asserter asserter) { this.asserter = asserter; }

    public Performer getPerformer() { return performer; }
    public void setPerformer(Performer performer) { this.performer = performer; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public List<FollowUp> getFollowUp() { return followUp; }
    public void setFollowUp(List<FollowUp> followUp) { this.followUp = followUp; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
