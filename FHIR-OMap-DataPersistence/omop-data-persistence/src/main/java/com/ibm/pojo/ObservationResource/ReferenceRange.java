package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class ReferenceRange {

    public Low low;
    public High high;
    public List<AppliesTo> appliesTo;
    public Age age;
    public Type type;

public Low getLow(){return low;}
public void setLow(Low low){this.low=low;}

public High getHigh(){return high;}
public void setHigh(High high){this.high=high;}

public List<AppliesTo> getAppliesTo(){return appliesTo;}
public void setAppliesTo(List<AppliesTo> appliesTo){this.appliesTo=appliesTo;}

public Age getAge(){return age;}
public void setAge(Age age){this.age=age;}

public Type getType(){return type;}
public void setType(Type type){this.type=type;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
