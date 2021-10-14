package com.ibm.pojo.RiskAssessmentResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Prediction {
    public Outcome outcome;
    public double probabilityDecimal;
    public WhenRange whenRange;

    public Outcome getOutcome(){return outcome;}
    public void setOutcome(Outcome outcome){this.outcome=outcome;}

    public double getProbabilityDecimal(){return probabilityDecimal;}
    public void setProbabilityDecimal(double probabilityDecimal){this.probabilityDecimal=probabilityDecimal;}

    public WhenRange getWhenRange(){return whenRange;}
    public void setWhenRange(WhenRange whenRange){this.whenRange=whenRange;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
