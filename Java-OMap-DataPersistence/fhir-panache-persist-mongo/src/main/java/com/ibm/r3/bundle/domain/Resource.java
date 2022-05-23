package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource{
    public String resourceType;
    public String id;
    public Meta meta;
    // public List<Name> name;
    public List<Telecom> telecom;
    public String gender;
    public String birthDate;
    public List<Address> address;
    public MaritalStatus maritalStatus;
    public List<Communication> communication;
    public ManagingOrganization managingOrganization;
    public String clinicalStatus;
    public String verificationStatus;
    public Object type;
   /* public List<Type> type;*/
    public List<Object> category;
    public Object code;
    public Patient patient;
    public String onsetDateTime;
    public String assertedDate;
    public List<Reaction> reaction;
    public String status;
    public Subject subject;
    public EffectivePeriod effectivePeriod;
    public ValueQuantity valueQuantity;
    public Interpretation interpretation;
    public List<Participant> participant;
    public Period period;
    public List<Location> location;
    public Date date;
    public List<Author> author;
    public String title;
    public String confidentiality;
    public List<Attester> attester;
    public Custodian custodian;
    public List<Event> event;
    public List<Section> section;
    public Practitioner practitioner;
    public Organization organization;
    public boolean notGiven;
    public VaccineCode vaccineCode;
    public boolean primarySource;
    public PerformedPeriod performedPeriod;
    public List<Performer> performer;
    public List<BodySite> bodySite;
    public MedicationReference medicationReference;
    public String taken;
    public Date indexed;
    public List<Content> content;
    public Text text;
    public List<Target> target;
    public Date recorded;
    public List<Agent> agent;
    public List<Entity> entity;
}
