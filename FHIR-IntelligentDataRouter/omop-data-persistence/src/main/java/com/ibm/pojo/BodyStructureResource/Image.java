package com.ibm.pojo.BodyStructureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Image {
    public String contentType;
    public String url;

    public String getContentType() { return contentType; }

    public void setContentType(String contentType) { this.contentType = contentType; }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
