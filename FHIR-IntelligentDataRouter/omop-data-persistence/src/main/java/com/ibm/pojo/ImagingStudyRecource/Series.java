package com.ibm.pojo.ImagingStudyRecource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Series {
    public String uid;
    public int number;
    public Modality modality;
    public String description;
    public int numberOfInstances;
    public BodySite bodySite;
    public List<Instance> instance;
    public List<Endpoint> endpoint;
    public Laterality laterality;
    public Date started;
    public List<Performer> performer;

    public Date getStarted() { return started; }

    public void setStarted(Date started) { this.started = started; }

    public Laterality getLaterality() { return laterality; }

    public void setLaterality(Laterality laterality) { this.laterality = laterality; }

    public List<Endpoint> getEndpoint() { return endpoint; }

    public void setEndpoint(List<Endpoint> endpoint) { this.endpoint = endpoint; }

    public List<Performer> getPerformer() { return performer; }

    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public BodySite getBodySite() { return bodySite; }

    public void setBodySite(BodySite bodySite) { this.bodySite = bodySite; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public int getNumberOfInstances() { return numberOfInstances; }

    public void setNumberOfInstances(int numberOfInstances) { this.numberOfInstances = numberOfInstances; }

    public List<Instance> getInstance() { return instance; }

    public void setInstance(List<Instance> instance) { this.instance = instance; }

    public Modality getModality() { return modality; }

    public void setModality(Modality modality) { this.modality = modality; }

    public String getUid() { return uid; }

    public void setUid(String uid) { this.uid = uid;
    }
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
