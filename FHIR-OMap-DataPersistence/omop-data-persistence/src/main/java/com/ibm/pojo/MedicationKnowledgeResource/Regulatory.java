package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class Regulatory {
    public Substitution substitution;
    public Schedule schedule;

    public Schedule getSchedule() { return schedule; }

    public void setSchedule(Schedule schedule) { this.schedule = schedule; }

    public Substitution getSubstitution() { return substitution; }

    public void setSubstitution(Substitution substitution) { this.substitution = substitution; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
