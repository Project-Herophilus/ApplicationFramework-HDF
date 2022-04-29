package com.ibm.pojo.PractitionerResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Practitioner {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public boolean active;
    public Name name;
    public List<Address> address;
    public List<Qualification> qualification;
    public Period period;

    public Period getPeriod() { return period; }
    public void setPeriod(Period period) { this.period = period; }

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public boolean isActive(){return active;}
    public void setActive(boolean active){this.active=active;}

    public Name getName(){return name;}
    public void setName(Name name){this.name=name;}

    public List<Address> getAddress(){return address;}

    public void setAddress(List<Address> address){this.address=address;}

    public List<Qualification> getQualification(){return qualification;}
    public void setQualification(List<Qualification> qualification){this.qualification=qualification;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
