package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ValueQuantity {

    public double value;
    public String unit;
    public String system;
    public String code;


    public double getValue(){return value;}
    public void setValue(double value){this.value=value;}

    public String getUnit(){return unit;}
    public void setUnit(String unit){this.unit=unit;}

    public String getSystem(){return system;}
    public void setSystem(String system){this.system=system;}

    public String getCode(){return code;}
    public void setCode(String code){this.code=code;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
