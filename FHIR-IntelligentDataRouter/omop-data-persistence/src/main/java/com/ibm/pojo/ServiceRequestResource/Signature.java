package com.ibm.pojo.ServiceRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Signature {
    public List<Type> type;
    public Date when;
    public Who who;
    public String targetFormat;
    public String sigFormat;
    public String data;

    public Date getWhen() { return when; }

    public void setWhen(Date when) { this.when = when; }

    public String getData() { return data; }

    public void setData(String data) { this.data = data; }

    public List<Type> getType() { return type; }

    public void setType(List<Type> type) { this.type = type; }

    public String getSigFormat() { return sigFormat; }

    public void setSigFormat(String sigFormat) { this.sigFormat = sigFormat; }

    public String getTargetFormat() { return targetFormat; }

    public void setTargetFormat(String targetFormat) { this.targetFormat = targetFormat; }

    public Who getWho() { return who; }

    public void setWho(Who who) { this.who = who; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
