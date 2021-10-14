package com.ibm.pojo.DiagnosticReportResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Entry {
    public String fullUrl;
    public Resource resource;

    public String getFullUrl(){return fullUrl;}
    public void setFullUrl(String fullUrl){this.fullUrl=fullUrl;}

    public Resource getResource(){return resource;}
    public void setResource(Resource resource){this.resource=resource;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
