package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ValueQuantity {

    public double value;


    public double getValue(){return value;}
    public void setValue(double value){this.value=value;}




    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
