package com.ibm.domain;

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
}
