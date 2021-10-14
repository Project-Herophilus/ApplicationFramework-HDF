package com.ibm.pojo.ConditionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Security {
    public String system;
    public String code;
    public String display;

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getDisplay() { return display; }

    public void setDisplay(String display) { this.display = display; }

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
