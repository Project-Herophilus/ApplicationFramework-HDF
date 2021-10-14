package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Procedure {

    public int sequence;
    public List<Type> type;
    public String date;
    public ProcedureCodeableConcept procedureCodeableConcept;
    public List<Udi> udi;

    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}

    public List<Type> getType(){return type;}
    public void setType(List<Type> type){this.type=type;}


    public String getDate(){return date;}
    public void setDate(String date){this.date=date;}

    public ProcedureCodeableConcept getProcedureCodeableConcept(){return procedureCodeableConcept;}
    public void setProcedureCodeableConcept(ProcedureCodeableConcept procedureCodeableConcept){this.procedureCodeableConcept=procedureCodeableConcept;}

    public List<Udi> getUdi(){return udi;}
    public void setUdi(List<Udi> udi){this.udi=udi;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
