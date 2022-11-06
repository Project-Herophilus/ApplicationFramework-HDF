package com.ibm.domain;

import java.util.List;

public class Immunization {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public VaccineCode vaccineCode;
    public Patient patient;
    public Encounter encounter;
    public String occurrenceDateTime;
    public boolean primarySource;
    public Location location;
    public Manufacturer manufacturer;
    public String lotNumber;
    public String expirationDate;
    public Site site;
    public Route route;
    public DoseQuantity doseQuantity;
    public List<Performer> performer;
    public List<Note> note;
    public List<ReasonCode> reasonCode;
    public boolean isSubpotent;
    public List<Education> education;
    public List<ProgramEligibility> programEligibility;
    public FundingSource fundingSource;
}
