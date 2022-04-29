package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UseContext {
    public Code code;
    public ValueCodeableConcept valueCodeableConcept;
    public ValueRange valueRange;

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public ValueCodeableConcept getValueCodeableConcept(){return valueCodeableConcept;}
    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept){this.valueCodeableConcept=valueCodeableConcept;}

    public ValueRange getValueRange(){return valueRange;}
    public void setValueRange(ValueRange valueRange){this.valueRange=valueRange;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}



