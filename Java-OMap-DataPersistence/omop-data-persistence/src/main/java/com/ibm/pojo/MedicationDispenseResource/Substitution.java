package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Substitution {
    public boolean wasSubstituted;
    public Type type;
    public List<Reason> reason;
    public List<ResponsibleParty> responsibleParty;

    public boolean isWasSubstituted() { return wasSubstituted; }

    public void setWasSubstituted(boolean wasSubstituted) { this.wasSubstituted = wasSubstituted; }

    public List<Reason> getReason() { return reason; }

    public void setReason(List<Reason> reason) { this.reason = reason; }

    public List<ResponsibleParty> getResponsibleParty() { return responsibleParty; }

    public void setResponsibleParty(List<ResponsibleParty> responsibleParty) { this.responsibleParty = responsibleParty; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
