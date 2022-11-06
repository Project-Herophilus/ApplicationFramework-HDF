package com.ibm.pojo.RelatedPersonResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Family {

    public List<Extension> extension;

    public List<Extension> getExtension(){return extension;}
    public void setExtension(List<Extension> extension){this.extension=extension;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
