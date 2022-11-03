package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Component {

    public Code code;
    public ValueQuantity valueQuantity;
    public List<Interpretation> interpretation;
    public DataAbsentReason dataAbsentReason;
    public ValueCodeableConcept valueCodeableConcept;

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public ValueQuantity getValueQuantity(){return valueQuantity;}
    public void setValueQuantity(ValueQuantity valueQuantity){this.valueQuantity=valueQuantity;}

    public List<Interpretation> getInterpretation(){return interpretation;}
    public void setInterpretation(List<Interpretation> interpretation){this.interpretation=interpretation;}

    public DataAbsentReason getDataAbsentReason(){return dataAbsentReason;}
    public void setDataAbsentReason(DataAbsentReason dataAbsentReason){this.dataAbsentReason=dataAbsentReason;}

    public ValueCodeableConcept getValueCodeableConcept(){return valueCodeableConcept;}
    public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept){this.valueCodeableConcept=valueCodeableConcept;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
