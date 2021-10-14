package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class AdditionalInstruction {
    public String text;

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
