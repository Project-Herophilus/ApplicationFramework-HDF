package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Criteria {

    public String language;
    public String expression;

    public String getLanguage(){return language;}
    public void set(String language){this.language=language;}

    public String getExpression(){return expression;}
    public void setExpression(String expression){this.expression=expression;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
