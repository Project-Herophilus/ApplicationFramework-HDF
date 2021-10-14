package com.ibm.pojo.LocationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Location {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public String name;
    public List<String> alias;
    public String description;
    public String mode;
    public List<Telecom> telecom;
    public Address address;
    public PhysicalType physicalType;
    public Position position;
    public ManagingOrganization managingOrganization;
    public List<Endpoint> endpoint;
    public OperationalStatus operationalStatus;
    public PartOf partOf;
    public String type;
    public List<Entry> entry;
    public String availabilityExceptions;

    public String getAvailabilityExceptions() { return availabilityExceptions; }
    public void setAvailabilityExceptions(String availabilityExceptions) { this.availabilityExceptions = availabilityExceptions; }

    public List<Entry> getEntry() { return entry; }
    public void setEntry(List<Entry> entry) { this.entry = entry; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public OperationalStatus getOperationalStatus() { return operationalStatus; }
    public void setOperationalStatus(OperationalStatus operationalStatus) { this.operationalStatus = operationalStatus; }

    public PartOf getPartOf() { return partOf; }
    public void setPartOf(PartOf partOf) { this.partOf = partOf; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public List<Endpoint> getEndpoint() { return endpoint; }
    public void setEndpoint(List<Endpoint> endpoint) { this.endpoint = endpoint; }

    public List<String> getAlias() { return alias; }
    public void setAlias(List<String> alias) { this.alias = alias; }

    public List<Telecom> getTelecom() { return telecom; }
    public void setTelecom(List<Telecom> telecom) { this.telecom = telecom; }

    public PhysicalType getPhysicalType() { return physicalType; }
    public void setPhysicalType(PhysicalType physicalType) { this.physicalType = physicalType; }

    public ManagingOrganization getManagingOrganization() { return managingOrganization; }
    public void setManagingOrganization(ManagingOrganization managingOrganization) { this.managingOrganization = managingOrganization; }

    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
