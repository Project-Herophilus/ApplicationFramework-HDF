package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Note {
    public String text;
    public String authorString;
    public String time;

    public String getAuthorString() { return authorString; }

    public void setAuthorString(String authorString) { this.authorString = authorString; }

    public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
