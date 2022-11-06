package com.ibm.pojo.PractitionerResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Period {

    public String start;

    public String getStart(){return start;}

    public void setStart(String start){this.start=start;}




    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
