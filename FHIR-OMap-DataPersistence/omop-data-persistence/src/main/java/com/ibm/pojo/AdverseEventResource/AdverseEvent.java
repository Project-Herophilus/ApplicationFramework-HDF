package com.ibm.pojo.AdverseEventResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class AdverseEvent {
     public String resourceType;
     public String id;
     public Text text;
     public Identifier identifier;
     public String actuality;
     public List<Category> category;
     public Event event;
     public Subject subject;
     public Date date;
     public Date detected;
     public Date recordedDate;
     public Seriousness seriousness;
     public Severity severity;
     public Recorder recorder;
     public List<SuspectEntity> suspectEntity;
     public Outcome outcome;
     public Location location;
     public List<Causality> causalities;
     public String study;

    public String getStudy() { return study; }
    public void setStudy(String study) { this.study = study; }

    public List<Causality> getCausalities() { return causalities; }
    public void setCausalities(List<Causality> causalities) { this.causalities = causalities; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public Date getDetected() { return detected; }
    public void setDetected(Date detected) { this.detected = detected; }

    public Date getRecordedDate() { return recordedDate; }
    public void setRecordedDate(Date recordedDate) { this.recordedDate = recordedDate; }

    public Outcome getOutcome() { return outcome; }
    public void setOutcome(Outcome outcome) { this.outcome = outcome; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Identifier getIdentifier() { return identifier; }
    public void setIdentifier(Identifier identifier) { this.identifier = identifier; }

    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }

    public List<Category> getCategory() { return category; }
    public void setCategory(List<Category> category) { this.category = category; }

    public List<SuspectEntity> getSuspectEntity() { return suspectEntity; }
    public void setSuspectEntity(List<SuspectEntity> suspectEntity) { this.suspectEntity = suspectEntity; }

    public Recorder getRecorder() { return recorder; }
    public void setRecorder(Recorder recorder) { this.recorder = recorder; }

    public Seriousness getSeriousness() { return seriousness; }
    public void setSeriousness(Seriousness seriousness) { this.seriousness = seriousness; }

    public Severity getSeverity() { return severity; }
    public void setSeverity(Severity severity) { this.severity = severity; }

    public String getActuality() { return actuality; }
    public void setActuality(String actuality) { this.actuality = actuality; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
