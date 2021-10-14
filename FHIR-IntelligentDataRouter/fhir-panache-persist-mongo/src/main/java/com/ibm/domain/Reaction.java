package com.ibm.domain; 
import java.util.List;

public class Reaction{
    public Substance substance;
    public List<Manifestation> manifestation;
    public String description;
    public String onset;
    public String severity;
    public ExposureRoute exposureRoute;
    public List<Note> note;

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public List<Manifestation> getManifestation() {
        return manifestation;
    }

    public void setManifestation(List<Manifestation> manifestation) {
        this.manifestation = manifestation;
    }
}
