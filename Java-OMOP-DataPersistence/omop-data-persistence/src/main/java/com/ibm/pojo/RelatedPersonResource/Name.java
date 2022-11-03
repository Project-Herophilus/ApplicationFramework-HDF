package com.ibm.pojo.RelatedPersonResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Name {

    public String family;
    public List<String> given;

    public Family familyPkg;

    public String getFamily(){return family;}
    public void setFamily(String family){this.family=family;}

    public List<String> getGiven(){return given;}
    public void setGiven(List<String> given){this.given=given;}





    public Family getFamilyPkg(){return familyPkg;}
    public void setFamilyPkg(Family familyPkg){this.familyPkg=familyPkg;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
