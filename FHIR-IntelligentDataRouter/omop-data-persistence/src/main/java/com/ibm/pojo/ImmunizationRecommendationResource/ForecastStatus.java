package com.ibm.pojo.ImmunizationRecommendationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ForecastStatus {
    public String text;

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
