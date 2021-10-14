package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifier {

    public String use;
    public Type type;
    public String system;
    public String value;
    public Period period;
    public Assigner assigner;

    public String getSystem(){ return system;}
    public void setSystem(String system){this.system=system;}

    public String getValue(){return value;}
    public void setValue(String value){this.value=value;}

    public String getUse(){return use;}
    public void setUse(String use){this.use=use;}

    public Type getType(){return type;}
    public void setType(Type type){this.type=type;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public Assigner getAssigner(){return assigner;}
    public void setAssigner(Assigner assigner){this.assigner=assigner;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
