package com.ibm.pojo.OrganizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Name {
    public String text;

    public String getText(){ return text;}
    public void setText(String text){this.text=text;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
