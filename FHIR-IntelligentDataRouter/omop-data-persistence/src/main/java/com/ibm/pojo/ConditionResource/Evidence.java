package com.ibm.pojo.ConditionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Evidence {
    public List<Code> code;
    public List<Detail> detail;

    public List<Code> getCode() { return code; }

    public void setCode(List<Code> code) { this.code = code; }

    public List<Detail> getDetail() { return detail; }

    public void setDetail(List<Detail> detail) { this.detail = detail; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}

