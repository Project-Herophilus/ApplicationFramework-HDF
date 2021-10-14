package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Party {

    public String reference;
    public String display;

    public String getReference(){return reference;}
    public void setReference(String reference){this.reference=reference;}

    public String getDisplay(){return display;}
    public void setDisplay(String display){this.display=display;}
    
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
