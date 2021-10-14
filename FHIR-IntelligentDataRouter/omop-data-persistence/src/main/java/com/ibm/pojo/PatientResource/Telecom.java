package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Telecom {

    public String system;
    public String value;
    public String use;
    public int rank;
    public Period period;

    public String getSystem(){ return system;}
    public void setSystem(String system){this.system=system;}


    public String getValue(){ return value;}
    public void setValue(String value){this.value=value;}

    public String getUse(){return use;}
    public void setUse(String use){this.use=use;}

    public int getRank(){return rank;}
    public void setRank(int rank){this.rank=rank;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
