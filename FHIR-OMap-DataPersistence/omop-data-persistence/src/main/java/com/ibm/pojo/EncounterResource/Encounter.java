package com.ibm.pojo.EncounterResource;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Entity;
import java.util.List;


public class Encounter {

    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public String status;
    public List<StatusHistory> statusHistory;
    public EncounterClass encounterClass;
    public List<ClassHistory> classHistory;
    public List<Type> type;
    public Priority priority;
    public Subject subject;
    public List<EpisodeOfCare> episodeOfCare;
    public List<BasedOn> basedOn;
    public List<Participant> participant;
    public List<Appointment> appointment;
    public Period period;
    public Length length;
    public List<Location> location;
    public List<ReasonCode> reasonCode;
    public List<Diagnosis> diagnosis;
    public List<Account> account;
    public Hospitalization hospitalization;
    public ServiceProvider serviceProvider;
    public PartOf partOf;
    public EncounterLocation encounterLocation;

    public EncounterLocation getEncounterLocation() { return encounterLocation; }
    public void setEncounterLocation(EncounterLocation encounterLocation) { this.encounterLocation = encounterLocation; }

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public PartOf getPartOf(){return partOf;}
    public void setPartOf(PartOf partOf){this.partOf=partOf;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public List<BasedOn> getBasedOn(){return basedOn;}
    public void setBasedOn(List<BasedOn> basedOn){this.basedOn=basedOn;}

    public List<Contained> getContained(){return contained;}
    public void setContained(List<Contained> contained){this.contained=contained;}

    public List<StatusHistory> getStatusHistory(){return statusHistory;}
    public void setStatusHistory(List<StatusHistory> statusHistory){this.statusHistory=statusHistory;}

    public EncounterClass getEncounterClass(){return encounterClass;}
    public void setEncounterClass(EncounterClass encounterClass){this.encounterClass=encounterClass;}

    public List<ClassHistory> getClassHistory(){return classHistory;}
    public void setClassHistory(List<ClassHistory> classHistory){this.classHistory=classHistory;}

    public List<Type> getType(){return type;}
    public void setType(List<Type> type){this.type=type;}

    public Priority getPriority(){return priority;}
    public void setPriority(Priority priority){this.priority=priority;}

    public Subject getSubject(){return subject;}
    public void setSubject(Subject subject){this.subject=subject;}

    public List<EpisodeOfCare> getEpisodeOfCare(){return episodeOfCare;}
    public void setEpisodeOfCare(List<EpisodeOfCare> episodeOfCare){this.episodeOfCare=episodeOfCare;}

    public List<Participant> getParticipant(){return participant;}
    public void setParticipant(List<Participant> participant){this.participant=participant;}

    public List<Appointment> getAppointment(){return appointment;}
    public void setAppointment(List<Appointment> appointment){this.appointment=appointment;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

  public Length getLength(){return length;}
  public void setLength(Length length){this.length=length;}

  public List<Location> getLocation(){return location;}
  public void setLocation(List<Location> location){this.location=location;}

  public List<ReasonCode> getReasonCode(){return reasonCode;}
  public void setReasonCode(List<ReasonCode> reasonCode){this.reasonCode=reasonCode;}

  public List<Diagnosis> getDiagnosis(){return diagnosis;}
  public void setDiagnosis(List<Diagnosis> diagnosis){this.diagnosis=diagnosis;}

  public List<Account> getAccount(){return account;}
  public void setAccount(List<Account> account){this.account=account;}

  public Hospitalization getHospitalization(){return hospitalization;}
  public void setHospitalization(Hospitalization hospitalization){this.hospitalization=hospitalization;}

  public ServiceProvider getServiceProvider(){return serviceProvider;}
  public void setServiceProvider(ServiceProvider serviceProvider){this.serviceProvider=serviceProvider;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
