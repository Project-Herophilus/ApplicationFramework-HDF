package com.ibm.r3.bundle.domain; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta{
    public List<String> profile;
}
