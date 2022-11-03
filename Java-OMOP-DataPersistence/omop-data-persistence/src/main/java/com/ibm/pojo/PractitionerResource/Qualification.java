package com.ibm.pojo.PractitionerResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Qualification {

    public List<Identifier> identifier;
    public Code code;
    public Period period;
    public Issuer issuer;

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public Issuer getIssuer(){return issuer;}
    public void setIssuer(Issuer issuer){this.issuer=issuer;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
