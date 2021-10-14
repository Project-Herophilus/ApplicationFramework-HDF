package com.ibm.pojo.GoalResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class OutcomeCode {
    public List<Coding> coding;
    public String text;

    public void setText(String text) { this.text = text; }

    public String getText() { return text; }

    public List<Coding> getCoding() { return coding; }

    public void setCoding(List<Coding> coding) { this.coding = coding; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }
}
