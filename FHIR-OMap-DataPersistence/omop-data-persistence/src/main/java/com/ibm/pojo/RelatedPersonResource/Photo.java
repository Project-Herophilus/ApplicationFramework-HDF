package com.ibm.pojo.RelatedPersonResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Photo {
    public String contentType;
    public String data;
    public String url;


    public String getContentType(){return contentType;}
    public void setContentType(String contentType){this.contentType=contentType;}

    public String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}

    public String getData(){return data;}
    public void setData(String data){this.data=data;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
