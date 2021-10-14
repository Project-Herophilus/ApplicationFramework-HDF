package com.ibm.pojo.BodyStructureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class BodyStructure {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public Location location;
    public String description;
    public Patient patient;
    public Morphology morphology;
    public List<Image> image;
    public boolean active;
    public List<LocationQualifier> locationQualifier;

    public List<LocationQualifier> getLocationQualifier() { return locationQualifier; }
    public void setLocationQualifier(List<LocationQualifier> locationQualifier) { this.locationQualifier = locationQualifier; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public List<Image> getImage() { return image; }
    public void setImage(List<Image> image) { this.image = image; }

    public Morphology getMorphology() { return morphology; }
    public void setMorphology(Morphology morphology) { this.morphology = morphology; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
