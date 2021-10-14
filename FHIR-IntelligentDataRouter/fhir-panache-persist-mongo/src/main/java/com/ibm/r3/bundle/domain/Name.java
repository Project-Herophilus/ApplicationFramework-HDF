package com.ibm.r3.bundle.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {
    public String text;
    public String family;
    public List<String> given;
    public List<String> prefix;
}
