package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;


public class Contained {

    public String resourceType;
    public String id;
    public List<Identifier> identifier;
    public boolean active;
    public List<Name> name;
    public String gender;
    public String birthDate;
    public BirthDate birthDateClass;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public boolean isActive(){return active;}
    public void setActive(boolean active){this.active=active;}

    public List<Name> getName(){return name;}
    public void setName(List<Name> name){this.name=name;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender=gender;}

    public String getBirthDate(){return birthDate;}
    public void setBirthDate(String birthDate){this.birthDate=birthDate;}

    public BirthDate getBirthDateClass(){return birthDateClass;}
    public void setBirthDateClass(BirthDate birthDateClass){this.birthDateClass=birthDateClass;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
