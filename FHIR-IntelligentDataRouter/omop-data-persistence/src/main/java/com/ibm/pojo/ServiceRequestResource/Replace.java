package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Replace {
    public String display;

    public String getDisplay() { return display; }

    public void setDisplay(String display) { this.display = display; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
