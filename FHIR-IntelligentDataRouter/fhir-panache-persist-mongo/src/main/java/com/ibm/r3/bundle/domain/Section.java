package com.ibm.r3.bundle.domain; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Section{
    public String title;
    public Code code;
    public String mode;
    public List<Entry> entry;
}
