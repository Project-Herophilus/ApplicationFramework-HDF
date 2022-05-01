package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ProcedureCodeableConcept {

    public String text;

    public String getText(){return text;}
    public void setText(String text){this.text=text;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
