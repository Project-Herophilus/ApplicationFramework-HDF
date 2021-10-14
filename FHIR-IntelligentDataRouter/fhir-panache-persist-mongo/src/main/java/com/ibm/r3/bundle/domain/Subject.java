package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subject{
    public String reference;
    public String display;
}
