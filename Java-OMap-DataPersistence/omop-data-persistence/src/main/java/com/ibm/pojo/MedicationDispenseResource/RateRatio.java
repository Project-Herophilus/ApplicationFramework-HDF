package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RateRatio {
    public Numerator numerator;
    public Denominator denominator;

    public Denominator getDenominator() { return denominator; }

    public void setDenominator(Denominator denominator) { this.denominator = denominator; }

    public Numerator getNumerator() { return numerator; }

    public void setNumerator(Numerator numerator) { this.numerator = numerator; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
