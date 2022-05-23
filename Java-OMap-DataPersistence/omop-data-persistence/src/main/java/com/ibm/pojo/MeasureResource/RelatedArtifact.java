package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RelatedArtifact {

    public String type;
    public String citation;
    public String resource;


    public String getType(){ return type;}
    public void setType(String type){this.type=type;}


    public String getCitation(){ return citation;}
    public void setCitation(String citation){this.citation=citation;}

    public String getResource(){return resource;}
    public void setResource(String resource){this.resource=resource;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
