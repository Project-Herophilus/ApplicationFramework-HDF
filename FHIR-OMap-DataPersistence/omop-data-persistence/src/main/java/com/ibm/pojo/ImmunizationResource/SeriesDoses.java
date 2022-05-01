package com.ibm.pojo.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SeriesDoses {
    public int seriesDosePositive;
    public String seriesDose;

    public String getSeriesDose() { return seriesDose; }

    public void setSeriesDose(String seriesDose) { this.seriesDose = seriesDose; }

    public int getSeriesDosePositive() { return seriesDosePositive; }

    public void setSeriesDosePositive(int seriesDosePositive) { this.seriesDosePositive = seriesDosePositive; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
