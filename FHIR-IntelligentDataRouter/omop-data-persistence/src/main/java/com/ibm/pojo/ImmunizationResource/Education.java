package com.ibm.pojo.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Education {
    public String documentType;
    public String publicationDate;
    public String presentationDate;
    public String reference;

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public String getDocumentType() { return documentType; }

    public void setDocumentType(String documentType) { this.documentType = documentType; }

    public String getPresentationDate() { return presentationDate; }

    public void setPresentationDate(String presentationDate) { this.presentationDate = presentationDate; }

    public String getPublicationDate() { return publicationDate; }

    public void setPublicationDate(String publicationDate) { this.publicationDate = publicationDate; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
