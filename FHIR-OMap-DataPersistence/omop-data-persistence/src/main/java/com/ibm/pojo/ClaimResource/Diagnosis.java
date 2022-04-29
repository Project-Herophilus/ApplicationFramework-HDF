package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Diagnosis {

    public int sequence;
    public DiagnosisCodeableConcept diagnosisCodeableConcept;
    public List<Type> type;
    public PackageCode packageCode;

    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}

    public DiagnosisCodeableConcept getDiagnosisCodeableConcept(){return diagnosisCodeableConcept;}
    public void setDiagnosisCodeableConcept(DiagnosisCodeableConcept diagnosisCodeableConcept){this.diagnosisCodeableConcept=diagnosisCodeableConcept;}

    public List<Type> getType(){return type;}
    public void setType(List<Type> type){this.type=type;}

    public PackageCode getPackageCode(){return packageCode;}
    public void setPackageCode(PackageCode packageCode){this.packageCode=packageCode;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
