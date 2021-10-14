package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Extension {

    public String url;
    public String valueDateTime;
    public String valueUri;

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

    public String getValueDateTime() { return valueDateTime; }

    public void setValueDateTime(String valueDateTime) { this.valueDateTime = valueDateTime; }

    public String getValueUri() { return valueUri; }

    public void setValueUri(String valueUri) { this.valueUri = valueUri; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
