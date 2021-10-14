package com.ibm.pojo.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Participant {

    public Period period;
    public Individual individual;

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public Individual getIndividual(){return individual;}
    public void setIndividual(Individual individual){this.individual=individual;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
