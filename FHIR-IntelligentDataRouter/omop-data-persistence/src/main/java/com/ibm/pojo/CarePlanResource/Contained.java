package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contained {
    public String resourceType;
    public String id;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public Code code;
    public Subject subject;
    public AchievementStatus achievementStatus;
    public Description description;
    public List<Participant> participant;
    public String lifecycleStatus;
    public List<Note> note;

    public void setDescription(Description description) { this.description = description; }

    public Description getDescription() { return description; }

    public AchievementStatus getAchievementStatus() { return achievementStatus; }

    public void setAchievementStatus(AchievementStatus achievementStatus) { this.achievementStatus = achievementStatus; }

    public List<Note> getNote() { return note; }

    public void setNote(List<Note> note) { this.note = note; }

    public List<Participant> getParticipant() { return participant; }

    public void setParticipant(List<Participant> participant) { this.participant = participant; }

    public String getLifecycleStatus() { return lifecycleStatus; }

    public void setLifecycleStatus(String lifecycleStatus) { this.lifecycleStatus = lifecycleStatus; }

    public ClinicalStatus getClinicalStatus() { return clinicalStatus; }

    public void setClinicalStatus(ClinicalStatus clinicalStatus) { this.clinicalStatus = clinicalStatus; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public Subject getSubject() { return subject; }

    public void setSubject(Subject subject) { this.subject = subject; }

    public VerificationStatus getVerificationStatus() { return verificationStatus; }

    public void setVerificationStatus(VerificationStatus verificationStatus) { this.verificationStatus = verificationStatus; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
