package com.ibm.pojo.ClinicalImpressionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Investigation {
    public Code code;
    public List<Item> item;

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public List<Item> getItem() { return item; }

    public void setItem(List<Item> item) { this.item = item; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
