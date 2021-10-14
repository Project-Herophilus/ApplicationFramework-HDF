package com.ibm.pojo.RelatedPersonResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class RelatedPerson {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public boolean active;
    public Patient patient;
    public List<Relationship> relationship;
    public List<Name> name;
    public List<Telecom> telecom;
    public String gender;
    public List<Address> address;
    public List<Photo> photo;
    public Period period;

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

    public Patient getPatient(){return patient;}
    public void setPatient(Patient patient){this.patient=patient;}

    public List<Relationship> getRelationship(){return relationship;}
    public void setRelationship(List<Relationship> relationship){this.relationship=relationship;}

    public List<Name> getName(){return name;}
    public void setName(List<Name> name){this.name=name;}

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender=gender;}

    public List<Address> getAddress(){return address;}
    public void setAddress(List<Address> address){this.address=address;}

    public List<Photo> getPhoto(){return photo;}
    public void setPhoto(List<Photo> photo){this.photo=photo;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
