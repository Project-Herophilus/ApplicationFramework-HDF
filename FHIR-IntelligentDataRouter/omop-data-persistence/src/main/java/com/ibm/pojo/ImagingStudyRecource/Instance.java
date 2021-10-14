package com.ibm.pojo.ImagingStudyRecource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Instance {
    public String uid;
    public SopClass sopClass;
    public int number;
    public String title;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public SopClass getSopClass() { return sopClass; }

    public void setSopClass(SopClass sopClass) { this.sopClass = sopClass; }

    public String getUid() { return uid; }

    public void setUid(String uid) { this.uid = uid; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
