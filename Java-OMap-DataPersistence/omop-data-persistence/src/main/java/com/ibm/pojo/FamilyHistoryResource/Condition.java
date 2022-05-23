package com.ibm.pojo.FamilyHistoryResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Condition {

    public Code code;
    public boolean contributedToDeath;
    public OnsetAge onsetAge;
    public List<Note> note;


    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public boolean isContributedToDeath(){return contributedToDeath;}
    public void setContributedToDeath(boolean contributedToDeath){this.contributedToDeath=contributedToDeath;}

    public OnsetAge getOnsetAge(){return onsetAge;}
    public void setOnsetAge(OnsetAge onsetAge){this.onsetAge=onsetAge;}

    public List<Note> getNote(){return note;}
    public void setNote(List<Note> note){this.note=note;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
