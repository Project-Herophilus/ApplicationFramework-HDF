package com.ibm.pojo.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

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
    public StatusReason statusReason;
    public ReportOrigin reportOrigin;
    public List<SubpotentReason> subpotentReason;
    public List<ProtocolApplied> protocolApplied;
    public ReasonReference reference;
    public List<Reaction> reaction;
    public List<SeriesDoses> seriesDose;

    public List<SeriesDoses> getSeriesDose() { return seriesDose; }
    public void setSeriesDose(List<SeriesDoses> seriesDose) { this.seriesDose = seriesDose; }

    public List<Reaction> getReaction() { return reaction; }
    public void setReaction(List<Reaction> reaction) { this.reaction = reaction; }

    public ReasonReference getReference() { return reference; }
    public void setReference(ReasonReference reference) { this.reference = reference;}

    public List<ProtocolApplied> getProtocolApplied() { return protocolApplied; }
    public void setProtocolApplied(List<ProtocolApplied> protocolApplied) { this.protocolApplied = protocolApplied; }

    public List<SubpotentReason> getSubpotentReason() { return subpotentReason; }
    public void setSubpotentReason(List<SubpotentReason> subpotentReason) { this.subpotentReason = subpotentReason; }

    public ReportOrigin getReportOrigin() { return reportOrigin; }
    public void setReportOrigin(ReportOrigin reportOrigin) { this.reportOrigin = reportOrigin; }

    public StatusReason getStatusReason() { return statusReason; }
    public void setStatusReason(StatusReason statusReason) { this.statusReason = statusReason; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public boolean isPrimarySource() { return primarySource; }
    public void setPrimarySource(boolean primarySource) { this.primarySource = primarySource; }

    public DoseQuantity getDoseQuantity() { return doseQuantity; }
    public void setDoseQuantity(DoseQuantity doseQuantity) { this.doseQuantity = doseQuantity; }

    public FundingSource getFundingSource() { return fundingSource; }
    public void setFundingSource(FundingSource fundingSource) { this.fundingSource = fundingSource; }

    public List<Education> getEducation() { return education; }
    public void setEducation(List<Education> education) { this.education = education; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<Performer> getPerformer() { return performer; }
    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public List<ProgramEligibility> getProgramEligibility() { return programEligibility; }
    public void setProgramEligibility(List<ProgramEligibility> programEligibility) { this.programEligibility = programEligibility; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public Manufacturer getManufacturer() { return manufacturer; }
    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public Route getRoute() { return route; }
    public void setRoute(Route route) { this.route = route; }

    public Site getSite() { return site; }
    public void setSite(Site site) { this.site = site; }

    public String getExpirationDate() { return expirationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    public String getLotNumber() { return lotNumber; }
    public void setLotNumber(String lotNumber) { this.lotNumber = lotNumber; }

    public String getOccurrenceDateTime() { return occurrenceDateTime; }
    public void setOccurrenceDateTime(String occurrenceDateTime) { this.occurrenceDateTime = occurrenceDateTime; }

    public VaccineCode getVaccineCode() { return vaccineCode; }
    public void setVaccineCode(VaccineCode vaccineCode) { this.vaccineCode = vaccineCode; }

    public boolean isSubpotent() { return isSubpotent; }
    public void setSubpotent(boolean subpotent) { isSubpotent = subpotent; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
