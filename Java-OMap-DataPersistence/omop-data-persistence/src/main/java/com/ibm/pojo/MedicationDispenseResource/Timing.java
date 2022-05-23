package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Timing {
    public Repeat repeat;
    public List<Date> event;

    public List<Date> getEvent() { return event; }

    public void setEvent(List<Date> event) { this.event = event; }

    public Repeat getRepeat() { return repeat; }

    public void setRepeat(Repeat repeat) { this.repeat = repeat; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
