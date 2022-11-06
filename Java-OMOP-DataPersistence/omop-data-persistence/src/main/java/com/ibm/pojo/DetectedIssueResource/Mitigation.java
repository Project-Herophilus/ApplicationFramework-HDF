package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.DetectedIssueResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Mitigation {

    public Action action;
    public String date;
    public Author author;

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public Action getAction() { return action; }

    public void setAction(Action action) { this.action = action; }

    public Author getAuthor() { return author; }

    public void setAuthor(Author author) { this.author = author; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
