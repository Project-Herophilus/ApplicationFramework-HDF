package com.ibm.domain;

import java.util.List;

public class CarePlan {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public List<String> instantiatesUri;
    public List<BasedOn> basedOn;
    public List<Replace> replaces;
    public List<PartOf> partOf;
    public String status;
    public String intent;
    public List<Category> category;
    public String description;
    public Subject subject;
    public Encounter encounter;
    public Period period;
    public String created;
    public Author author;
    public List<CareTeam> careTeam;
    public List<Address> addresses;
    public List<Goal> goal;
    public List<Activity> activity;
}
