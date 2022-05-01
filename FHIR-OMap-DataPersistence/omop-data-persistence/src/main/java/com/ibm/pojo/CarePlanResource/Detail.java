package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Detail {
    public Code code;
    public String status;
    public StatusReason statusReason;
    public boolean doNotPerform;
    public ScheduledTiming scheduledTiming;
    public Location location;
    public List<Performer> performer;
    public Date scheduledString;
    public String kind;

    public String getKind() { return kind; }

    public void setKind(String kind) { this.kind = kind; }

    public Date getScheduledString() { return scheduledString; }

    public void setScheduledString(Date scheduledString) { this.scheduledString = scheduledString; }

    public boolean isDoNotPerform() { return doNotPerform; }

    public void setDoNotPerform(boolean doNotPerform) { this.doNotPerform = doNotPerform; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public List<Performer> getPerformer() { return performer; }

    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public ScheduledTiming getScheduledTiming() { return scheduledTiming; }

    public void setScheduledTiming(ScheduledTiming scheduledTiming) { this.scheduledTiming = scheduledTiming; }

    public StatusReason getStatusReason() { return statusReason; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public void setStatusReason(StatusReason statusReason) { this.statusReason = statusReason; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}