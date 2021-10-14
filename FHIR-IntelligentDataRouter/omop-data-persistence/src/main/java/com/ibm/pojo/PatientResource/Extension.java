package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Extension {

    public String url;
    public String valueDateTime;
    public String valueString;

    public String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}

    public String getValueDateTime(){return valueDateTime;}
    public void setValueDateTime(String valueDateTime){this.valueDateTime=valueDateTime;}

    public String getValueString(){return valueString;}
    public void setValueString(String valueString){this.valueString=valueString;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
