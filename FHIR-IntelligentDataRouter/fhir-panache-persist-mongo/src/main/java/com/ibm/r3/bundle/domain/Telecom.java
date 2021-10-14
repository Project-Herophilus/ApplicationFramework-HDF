package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Telecom{
    public String system;
    public String value;
    public String use;
}
