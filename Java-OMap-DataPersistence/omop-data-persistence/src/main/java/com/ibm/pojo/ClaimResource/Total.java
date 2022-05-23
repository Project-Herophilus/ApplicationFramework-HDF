package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Total {

    public double value;
    public String currency;

    public double getValue(){return value;}
    public void setValue(double value){this.value=value;}

    public String getCurrency(){return currency;}
    public void setCurrency(String currency){this.currency=currency;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
