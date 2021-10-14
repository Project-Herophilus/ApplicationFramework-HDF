package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Extension {

    public String url;
    public String valueDateTime;
    public String valueDecimal;

    public String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}

    public String getValueDateTime(){return valueDateTime;}
    public void setValueDateTime(String valueDateTime){this.valueDateTime=valueDateTime;}

    public String getValueDecimal(){return valueDecimal;}
    public void setValueDecimal(String valueDecimal){this.valueDecimal=valueDecimal;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
