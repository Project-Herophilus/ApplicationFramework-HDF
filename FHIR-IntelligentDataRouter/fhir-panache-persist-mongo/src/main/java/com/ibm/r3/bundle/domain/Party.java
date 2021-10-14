package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Party{
    public String reference;
    public String display;
}
