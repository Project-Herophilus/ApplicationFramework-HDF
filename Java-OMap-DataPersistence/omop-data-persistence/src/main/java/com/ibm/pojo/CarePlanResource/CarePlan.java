package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class CarePlan {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public List<String> instantiatesUri;
    public List<String> instantiatesCanonical;
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
    public Contributor contributor;
    public List<CareTeam> careTeam;
    public List<SupportingInfo> supportingInfo;
    public List<Address> addresses;
    public List<Goal> goal;
    public List<Activity> activity;
    public List<Extension> extension;
    public List<Note> note;
    public String title;

    public List<SupportingInfo> getSupportingInfo() { return supportingInfo; }
    public void setSupportingInfo(List<SupportingInfo> supportingInfo) { this.supportingInfo = supportingInfo; }

    public Contributor getContributor() { return contributor; }
    public void setContributor(Contributor contributor) { this.contributor = contributor; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<String> getInstantiatesCanonical() { return instantiatesCanonical; }
    public void setInstantiatesCanonical(List<String> instantiatesCanonical) { this.instantiatesCanonical = instantiatesCanonical; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public List<Extension> getExtension() { return extension; }
    public void setExtension(List<Extension> extension) { this.extension = extension; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public Encounter getEncounter() { return encounter; }
    public void setEncounter(Encounter encounter) { this.encounter = encounter; }

    public List<Activity> getActivity() { return activity; }
    public void setActivity(List<Activity> activity) { this.activity = activity; }

    public List<Address> getAddresses() { return addresses; }
    public void setAddresses(List<Address> addresses) { this.addresses = addresses; }

    public List<CareTeam> getCareTeam() { return careTeam; }
    public void setCareTeam(List<CareTeam> careTeam) { this.careTeam = careTeam; }

    public List<BasedOn> getBasedOn() { return basedOn; }
    public void setBasedOn(List<BasedOn> basedOn) { this.basedOn = basedOn; }

    public List<Category> getCategory() { return category; }
    public void setCategory(List<Category> category) { this.category = category; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public List<Goal> getGoal() { return goal; }
    public void setGoal(List<Goal> goal) { this.goal = goal; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public List<PartOf> getPartOf() { return partOf; }
    public void setPartOf(List<PartOf> partOf) { this.partOf = partOf; }

    public List<Replace> getReplaces() { return replaces; }
    public void setReplaces(List<Replace> replaces) { this.replaces = replaces; }

    public List<String> getInstantiatesUri() { return instantiatesUri; }
    public void setInstantiatesUri(List<String> instantiatesUri) { this.instantiatesUri = instantiatesUri; }

    public Period getPeriod() { return period; }
    public void setPeriod(Period period) { this.period = period; }

    public String getCreated() { return created; }
    public void setCreated(String created) { this.created = created; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getIntent() { return intent; }
    public void setIntent(String intent) { this.intent = intent; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}



