package com.ibm.pojo.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ClassHistory {
    public EncounterClass encounterClass;
    public Period period;


    public EncounterClass getEncounterClass(){return encounterClass;}
    public void setEncounterClass(EncounterClass encounterClass){this.encounterClass=encounterClass;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
