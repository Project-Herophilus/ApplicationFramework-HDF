package com.ibm.pojo.GroupResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Extension {
    public String url;
    public ValueReference valueReference;

    public String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}

    public ValueReference getValueReference(){return valueReference;}
    public void setValueReference(ValueReference valuereference){this.valueReference=valuereference;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
