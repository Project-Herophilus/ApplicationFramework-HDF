package com.ibm.pojo.MeasureResource;

import com.ibm.pojo.MeasureResource.Coding;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;


public class Code {

    public String code;
    public String system;
    public List<Coding> coding;
    public String text;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    public String getText(){return text;}

    public void setText(String text){this.text=text;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
