package com.ibm.domain;

import java.util.Date;

public class Extension{
    public String url;
    public String valueString;
    public String valueMarkdown;
    public Date valueDateTime;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public String getValueMarkdown() {
        return valueMarkdown;
    }

    public void setValueMarkdown(String valueMarkdown) {
        this.valueMarkdown = valueMarkdown;
    }

    public Date getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(Date valueDateTime) {
        this.valueDateTime = valueDateTime;
    }
}
