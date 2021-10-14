package com.ibm.pojo.GroupResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Characteristic {
    public Code code;
    public ValueCodeableConcept valueCodeableConcept;
    public boolean exclude;

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public ValueCodeableConcept getValueCodeableConcept(){return valueCodeableConcept;}
    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept){this.valueCodeableConcept=valueCodeableConcept;}

    public boolean isExclude(){return exclude;}
    public void  setExclude(boolean exclude){this.exclude=exclude;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
