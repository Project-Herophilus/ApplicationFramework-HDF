package com.ibm.pojo.AllergyIntoleranceResource;



import java.util.List;

public class Reaction {
    public Substance substance;
    public List<Manifestation> manifestation;
    public String description;
    public String onset;
    public String severity;
    public ExposureRoute exposureRoute;
    public List<Note> note;



    public Substance getSubstance(){return substance;}
    public void setSubstance(Substance substance) { this.substance=substance;}

    public List<Manifestation> getManifestation() {
        return manifestation;
    }

    public void setManifestation(List<Manifestation> manifestation) {
        this.manifestation = manifestation;
    }

    public String getDescription(){ return description;}

    public void setDescription(String description) { this.description=description;}

    public String getOnset(){ return onset;}

    public void setOnset(String onset) { this.onset=onset;}

    public String getSeverity(){ return severity;}

    public void setSeverity(String severity) { this.severity=severity;}

    public ExposureRoute getExposureRoute(){return exposureRoute;}
    public void setExposureRoute(ExposureRoute exposureRoute) { this.exposureRoute=exposureRoute;}

    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }


}
