package com.ibm.pojo.PractitionerRoleResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Resource {
    public String resourceType;
    public String id;
    public Text text;
    public Practitioner practitioner;
    public Organization organization;
    public List<Code> code;
    public List<Specialty> specialty;
    public List<Identifier> identifier;
    public Period period;
    public List<Location> location;
    public List<HealthcareService> healthcareService;
    public List<Telecom> telecom;
    public List<AvailableTime> availableTime;
    public String availabilityExceptions;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public Practitioner getPractitioner(){return practitioner;}
    public void setPractitioner(Practitioner practitioner){this.practitioner=practitioner;}

    public Organization getOrganization(){return organization;}
    public void setOrganization(Organization organization){this.organization=organization;}

    public List<Code> getCode(){return code;}
    public void setCode(List<Code> code){this.code=code;}

    public List<Specialty> getSpecialty(){return specialty;}
    public void setSpecialty(List<Specialty> specialty){this.specialty=specialty;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public List<Location> getLocation(){return location;}
    public void setLocation(List<Location> location){this.location=location;}

    public List<HealthcareService> getHealthcareService(){return healthcareService;}
    public void setHealthcareService(List<HealthcareService> healthcareService){this.healthcareService=healthcareService;}

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}

    public List<AvailableTime> getAvailableTime(){return availableTime;}
    public void setAvailableTime(List<AvailableTime> availableTime){this.availableTime=availableTime;}

    public String getAvailabilityExceptions(){return availabilityExceptions;}
    public void setAvailabilityExceptions(String availabilityExceptions){this.availabilityExceptions=availabilityExceptions;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
