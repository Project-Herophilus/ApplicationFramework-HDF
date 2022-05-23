package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contained {

    public String resourceType;
    public String id;
    public List<Identifier> identifier;
    public List<Name> name;
    public String gender;
    public String birthDate;
    public List<Address> address;
    public String status;
    public Type type;
    public Subscriber subscriber;
    public Subject subject;
    public Beneficiary beneficiary;
    public String dependent;
    public Relationship relationship;
    public List<Payor> payor;
    public List<Class> Class;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public List<Name> getName(){return name;}
    public void setName(List<Name> name){this.name=name;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender=gender;}

    public String getBirthDate(){return birthDate;}
    public void setBirthDate(String birthDate){this.birthDate=birthDate;}

    public List<Address> getAddress(){return address;}
    public void setAddress(List<Address> address){this.address=address;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public Type getType(){return type;}
    public void setType(Type type){this.type=type;}

    public Subscriber getSubscriber(){return subscriber;}
    public void setSubscriber(Subscriber subscriber){this.subscriber=subscriber;}

    public Subject getSubject(){return subject;}
    public void setSsubject(Subject subject){this.subject=subject;}

    public Beneficiary getBeneficiary(){return beneficiary;}
    public void setBeneficiary(Beneficiary beneficiary){this.beneficiary=beneficiary;}

    public String getDependent(){return dependent;}
    public void setDependent(String dependent){this.dependent=dependent;}

    public Relationship getRelationship(){return relationship;}
    public void setRelationship(Relationship relationship){this.relationship=relationship;}

    public List<Payor> getPayor(){return payor;}
    public void setPayor(List<Payor> payor){this.payor=payor;}

    public List<Class> getClasses(){return Class;}
    public void setClasses(List<Class> Class){this.Class=Class;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
