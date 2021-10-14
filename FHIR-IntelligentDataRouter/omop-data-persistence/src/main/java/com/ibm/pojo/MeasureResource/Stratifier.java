package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Stratifier {

    public Code code;
    public Criteria criteria;

    public List<Component> component;




    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public Criteria getCriteria(){return criteria;}
    public void setCriteria(Criteria criteria){this.criteria=criteria;}


    public List<Component> getComponent(){return component;}
    public void setComponent(List<Component> component){this.component=component;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
