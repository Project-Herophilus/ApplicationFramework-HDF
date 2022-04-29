package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.DetectedIssueResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class DetectedIssue {
    public String resourceType;
    public String id;
    public Text text;
    public String status;
    public Code code;
    public String severity;
    public String identifiedDateTime;
    public Author author;
    public List<Implicated> implicated;
    public String detail;
    public List<Mitigation> mitigation;
    public List<Identifier> identifier;

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public Code getCode() { return code; }
    public void setCode(Code code) { this.code = code; }

    public List<Implicated> getImplicated() { return implicated; }
    public void setImplicated(List<Implicated> implicated) { this.implicated = implicated; }

    public List<Mitigation> getMitigation() { return mitigation; }
    public void setMitigation(List<Mitigation> mitigation) { this.mitigation = mitigation; }

    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }

    public String getIdentifiedDateTime() { return identifiedDateTime; }
    public void setIdentifiedDateTime(String identifiedDateTime) { this.identifiedDateTime = identifiedDateTime; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
