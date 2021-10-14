package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Specimen {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public AccessionIdentifier accessionIdentifier;
    public String status;
    public Type type;
    public Subject subject;
    public Date receivedTime;
    public List<Request> request;
    public Collection collection;
    public List<Container> container;
    public List<Note> note;
    public List<Parent> parent;
    public List<Processing> processing;
    public Duration duration;
    public Condition condition;
    public Time time;

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }

    public Condition getCondition() { return condition; }
    public void setCondition(Condition condition) { this.condition = condition; }

    public Duration getDuration() { return duration; }
    public void setDuration(Duration duration) { this.duration = duration; }

    public List<Processing> getProcessing() { return processing; }
    public void setProcessing(List<Processing> processing) { this.processing = processing; }

    public List<Parent> getParent() { return parent; }
    public void setParent(List<Parent> parent) { this.parent = parent; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public AccessionIdentifier getAccessionIdentifier() { return accessionIdentifier; }
    public void setAccessionIdentifier(AccessionIdentifier accessionIdentifier) { this.accessionIdentifier = accessionIdentifier; }

    public Collection getCollection() { return collection; }
    public void setCollection(Collection collection) { this.collection = collection; }

    public Date getReceivedTime() { return receivedTime; }
    public void setReceivedTime(Date receivedTime) { this.receivedTime = receivedTime; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public List<Container> getContainer() { return container; }
    public void setContainer(List<Container> container) { this.container = container; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<Request> getRequest() { return request; }
    public void setRequest(List<Request> request) { this.request = request; }

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
