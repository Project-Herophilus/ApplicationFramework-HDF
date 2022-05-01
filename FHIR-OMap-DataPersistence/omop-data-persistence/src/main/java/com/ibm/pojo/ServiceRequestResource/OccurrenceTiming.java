package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OccurrenceTiming {
    public Repeat repeat;

    public Repeat getRepeat() { return repeat; }

    public void setRepeat(Repeat repeat) { this.repeat = repeat; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
