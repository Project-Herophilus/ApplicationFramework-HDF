package com.ibm.pojo.RiskAssessmentResource;

import com.ibm.pojo.RelatedPersonResource.Coding;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Type {
    public List<com.ibm.pojo.RelatedPersonResource.Coding> coding;
    public String text;

    public List<com.ibm.pojo.RelatedPersonResource.Coding> getCoding(){return coding;}
    public void setCoding( List<Coding> coding) {this.coding=coding;}

    public String getText(){return text;}
    public void setText(String text){this.text=text;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
