package com.ibm.pojo.ObservationResource;

import com.ibm.pojo.ObservationResource.Coding;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;


public class BodySite {

    public List<Coding> coding;


    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
