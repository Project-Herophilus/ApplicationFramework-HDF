package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Extension {
    public String url;
    public ValueCodeableConcept valueCodeableConcept;
    public Date valueDateTime;
    public String valueString;
}
