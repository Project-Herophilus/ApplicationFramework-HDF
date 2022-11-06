package com.ibm.pojo.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Dosage {

    public String text;
    public Route route;
    public Method method;
    public Dose dose;
    public Site site;
    public RateRatio rateRatio;
    public RateQuantity rateQuantity;

    public RateQuantity getRateQuantity() { return rateQuantity; }

    public void setRateQuantity(RateQuantity rateQuantity) { this.rateQuantity = rateQuantity; }

    public RateRatio getRateRatio() { return rateRatio; }

    public void setRateRatio(RateRatio rateRatio) { this.rateRatio = rateRatio; }

    public Site getSite() { return site; }

    public void setSite(Site site) { this.site = site; }

    public Dose getDose() { return dose; }

    public void setDose(Dose dose) { this.dose = dose; }

    public Method getMethod() { return method; }

    public void setMethod(Method method) { this.method = method; }

    public Route getRoute() { return route; }

    public void setRoute(Route route) { this.route = route; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
