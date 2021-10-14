package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Type {
    public List<Coding> coding;
    public String text;
    public String system;
    public String code;
    public String display;

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getDisplay() { return display; }

    public void setDisplay(String display) { this.display = display; }

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public List<Coding> getCoding() { return coding; }

    public void setCoding(List<Coding> coding) { this.coding = coding; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
