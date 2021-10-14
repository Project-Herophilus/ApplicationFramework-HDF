package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Processing {
    public String description;
    public Procedure procedure;
    public List<Additive> additive;
    public Date timeDateTime;

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Procedure getProcedure() { return procedure; }

    public void setProcedure(Procedure procedure) { this.procedure = procedure; }

    public Date getTimeDateTime() { return timeDateTime; }

    public void setTimeDateTime(Date timeDateTime) { this.timeDateTime = timeDateTime; }

    public List<Additive> getAdditive() { return additive; }

    public void setAdditive(List<Additive> additive) { this.additive = additive; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
