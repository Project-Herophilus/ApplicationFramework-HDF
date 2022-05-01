package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SupportingInfo {

    public int sequence;
    public Category category;
    public Code code;
    public String timingDate;
    public Reason reason;
    public String valueString;
    public TimingPeriod timingPeriod;
    public ValueQuantity valueQuantity;

    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}

    public Category getCategory(){return category;}
    public void setCategory(Category category){this.category=category;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public String getTimingDate(){return timingDate;}
    public void setTimingDate(String timingDate){this.timingDate=timingDate;}

    public Reason getReason(){return reason;}
    public void setReason(Reason reason){this.reason=reason;}

    public String getValueString(){return valueString;}
    public void setValueString(String valueString){this.valueString=valueString;}

    public TimingPeriod getTimingPeriod(){return timingPeriod;}
    public void setTimingPeriod(TimingPeriod timingPeriod){this.timingPeriod=timingPeriod;}

    public ValueQuantity getValueQuantity(){return valueQuantity;}
    public void setValueQuantity(ValueQuantity valueQuantity){this.valueQuantity=valueQuantity;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
