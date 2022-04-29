package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Population {
    public Code code;
    public Criteria criteria;

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public Criteria getCriteria(){return criteria;}
    public void setCriteria(Criteria criteria){this.criteria=criteria;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
