package com.ibm.pojo.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Coding {

    public String code;
    public String system;
    public String display;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}