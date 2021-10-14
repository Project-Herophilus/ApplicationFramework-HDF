package com.ibm.domain;

import java.util.List;

public class Condition{
    public String resourceType;
    public String id;
    public Text text;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public List<Category> category;
    public Severity severity;
    public Code code;
    public List<BodySite> bodySite;
    public Subject subject;
    public String onsetDateTime;


}
