package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Progress {

    public String time;
    public String text;

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
