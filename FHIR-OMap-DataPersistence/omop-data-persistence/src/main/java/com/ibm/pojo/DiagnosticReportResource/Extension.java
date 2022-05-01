package com.ibm.pojo.DiagnosticReportResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Extension {
    public String url;
    public ValueCodeableConcept valueCodeableConcept;

    public String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}

    public ValueCodeableConcept getValueCodeableConcept(){return valueCodeableConcept;}
    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept){this.valueCodeableConcept=valueCodeableConcept;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
