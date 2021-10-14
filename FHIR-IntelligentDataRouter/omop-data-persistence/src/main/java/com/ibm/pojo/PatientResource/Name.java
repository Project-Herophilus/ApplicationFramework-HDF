package com.ibm.pojo.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Name {
    public String use;
    public String family;
    public List<String> given;
    public Period period;
    public Family familyPkg;

    public String getFamily(){return family;}
    public void setFamily(String family){this.family=family;}

    public List<String> getGiven(){return given;}
    public void setGiven(List<String> given){this.given=given;}

    public String getUse(){return use;}
    public void setUse(String use){this.use=use;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public Family getFamilyPkg(){return familyPkg;}
    public void setFamilyPkg(Family familyPkg){this.familyPkg=familyPkg;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
