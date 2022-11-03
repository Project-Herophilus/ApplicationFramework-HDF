package com.ibm.pojo.ImmunizationRecommendationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class DateCriterion {
    public Code code;
    public Date value;

    public Date getValue() { return value; }

    public void setValue(Date value) { this.value = value; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
