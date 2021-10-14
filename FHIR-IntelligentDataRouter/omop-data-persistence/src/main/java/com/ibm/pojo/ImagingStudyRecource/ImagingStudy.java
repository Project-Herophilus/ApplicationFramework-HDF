package com.ibm.pojo.ImagingStudyRecource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class ImagingStudy {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public Subject subject;
    public Date started;
    public int numberOfSeries;
    public int numberOfInstances;
    public List<Series> series;
    public List<Modality> modality;
    public Encounter encounter;
    public List<BasedOn> basedOn;
    public Referrer referrer;
    public List<Interpreter> interpreter;
    public List<Endpoint> endpoint;
    public ProcedureReference procedureReference;
    public List<ProcedureCode> procedureCode;
    public List<ReasonCode> reasonCode;
    public List<Note> note;

    public Referrer getReferrer() { return referrer; }
    public void setReferrer(Referrer referrer) { this.referrer = referrer; }

    public ProcedureReference getProcedureReference() { return procedureReference; }
    public void setProcedureReference(ProcedureReference procedureReference) { this.procedureReference = procedureReference; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public List<ProcedureCode> getProcedureCode() { return procedureCode; }
    public void setProcedureCode(List<ProcedureCode> procedureCode) { this.procedureCode = procedureCode; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<Modality> getModality() { return modality; }
    public void setModality(List<Modality> modality) { this.modality = modality; }

    public List<Interpreter> getInterpreter() { return interpreter; }
    public void setInterpreter(List<Interpreter> interpreter) { this.interpreter = interpreter; }

    public List<Endpoint> getEndpoint() { return endpoint; }
    public void setEndpoint(List<Endpoint> endpoint) { this.endpoint = endpoint; }

    public List<BasedOn> getBasedOn() { return basedOn; }
    public void setBasedOn(List<BasedOn> basedOn) { this.basedOn = basedOn; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Date getStarted() { return started; }
    public void setStarted(Date started) { this.started = started; }

    public int getNumberOfInstances() { return numberOfInstances; }
    public void setNumberOfInstances(int numberOfInstances) { this.numberOfInstances = numberOfInstances; }

    public int getNumberOfSeries() { return numberOfSeries; }
    public void setNumberOfSeries(int numberOfSeries) { this.numberOfSeries = numberOfSeries; }

    public List<Series> getSeries() { return series; }
    public void setSeries(List<Series> series) { this.series = series; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
