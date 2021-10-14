package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Coding {

    public String system;
    public String code;
    public String display;
    public List<Extension> extension;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public List<Extension> getExtension(){return extension;}
    public void setExtension(List<Extension> extension) {this.extension=extension;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }



}
