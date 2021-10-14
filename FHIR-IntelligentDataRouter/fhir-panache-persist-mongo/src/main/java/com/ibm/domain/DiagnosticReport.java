package com.ibm.domain;

import java.util.Date;
import java.util.List;

public class DiagnosticReport {
    public String resourceType;
    public String id;
    public Meta meta;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public List<Category> category;
    public Code code;
    public Subject subject;
    public Encounter encounter;
    public Date effectiveDateTime;
    public Date issued;
    public List<Performer> performer;
    public List<Result> result;
    public List<PresentedForm> presentedForm;
}
