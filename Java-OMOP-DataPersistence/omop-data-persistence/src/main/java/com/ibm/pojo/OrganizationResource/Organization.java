package com.ibm.pojo.OrganizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Organization {

    public String resourceType;
    public String id;
    public Text text;
    public boolean active;
    public List<Type> type;
    public String name;
    public List<Telecom> telecom;
    public List<Address> address;
    public PartOf partOf;
    public List<Contact> contact;

    public String getResourceType(){ return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){ return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){ this.text=text;}

    public boolean isActive(){ return active;}
    public void setActive(boolean active){ this.active=active;}

    public List<Type> getType(){ return type;}
    public void setType(List<Type> type){this.type=type;}

    public String getName(){ return name;}
    public void setName(String name){this.name=name;}

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}

    public List<Address> getAddress(){return address;}
    public void setAddress(List<Address> address){ this.address=address;}


    public PartOf getPartOf(){ return partOf;}
    public void setPartOf(PartOf partOf){this.partOf=partOf;}

    public List<Contact> getContact(){return contact;}
    public void setContact(List<Contact> contact){this.contact=contact;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
