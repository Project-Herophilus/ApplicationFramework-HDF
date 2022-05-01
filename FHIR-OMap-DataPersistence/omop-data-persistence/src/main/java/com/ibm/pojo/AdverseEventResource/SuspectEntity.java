package com.ibm.pojo.AdverseEventResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SuspectEntity {

    public Instance instance;

    public Instance getInstance() { return instance; }

    public void setInstance(Instance instance) { this.instance = instance; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
