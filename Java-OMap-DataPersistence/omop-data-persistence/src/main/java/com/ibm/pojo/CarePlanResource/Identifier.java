package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifier {
    public String value;
    public String use;
    public String system;

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public String getUse() { return use; }

    public void setUse(String use) { this.use = use; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
