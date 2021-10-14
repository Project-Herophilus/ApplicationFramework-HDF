package com.ibm.pojo.FamilyMemberHistoryResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Condition {
    public Code code;
    public boolean contributedToDeath;
    public OnsetAge onsetAge;
    public List<Note> note;

    public boolean isContributedToDeath() { return contributedToDeath; }

    public void setContributedToDeath(boolean contributedToDeath) { this.contributedToDeath = contributedToDeath; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public List<Note> getNote() { return note; }

    public void setNote(List<Note> note) { this.note = note; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
