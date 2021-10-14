package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class productCodeableConcept {

    public String text;
    public List<Coding> coding;

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public List<Coding> getCoding() { return coding; }

    public void setCoding(List<Coding> coding) { this.coding = coding; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}

