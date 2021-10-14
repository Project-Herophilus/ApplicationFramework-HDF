package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dosage{
    public Timing timing;
    public Route route;
    public DoseQuantity doseQuantity;
}
