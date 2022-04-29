package com.ibm.pojo.ImmunizationRecommendationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class ImmunizationRecommendation {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public Patient patient;
    public Date date;
    public Authority authority;
    public List<Recommendation> recommendation;
    public String description;

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public List<Recommendation> getRecommendation() { return recommendation; }
    public void setRecommendation(List<Recommendation> recommendation) { this.recommendation = recommendation; }

    public Authority getAuthority() { return authority; }
    public void setAuthority(Authority authority) { this.authority = authority; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
