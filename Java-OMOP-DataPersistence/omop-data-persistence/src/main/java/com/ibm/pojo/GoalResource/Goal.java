package com.ibm.pojo.GoalResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Goal {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String lifecycleStatus;
    public List<Category> category;
    public Priority priority;
    public Description description;
    public Subject subject;
    public String startDate;
    public List<Target> target;
    public String statusDate;
    public String statusReason;
    public ExpressedBy expressedBy;
    public List<Address> addresses;
    public List<OutcomeReference> outcomeReference;
    public AchievementStatus achievementStatus;
    public List<OutcomeCode> outcomeCode;

    public List<OutcomeCode> getOutcomeCode() { return outcomeCode; }
    public void setOutcomeCode(List<OutcomeCode> outcomeCode) { this.outcomeCode = outcomeCode; }

    public AchievementStatus getAchievementStatus() { return achievementStatus; }
    public void setAchievementStatus(AchievementStatus achievementStatus) { this.achievementStatus = achievementStatus; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Description getDescription() { return description; }
    public void setDescription(Description description) { this.description = description; }

    public List<Identifier> getIdentifier() { return identifier; }
    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public ExpressedBy getExpressedBy() { return expressedBy; }
    public void setExpressedBy(ExpressedBy expressedBy) { this.expressedBy = expressedBy; }

    public List<Address> getAddresses() { return addresses; }
    public void setAddresses(List<Address> addresses) { this.addresses = addresses; }

    public List<Category> getCategory() { return category; }
    public void setCategory(List<Category> category) { this.category = category; }

    public List<OutcomeReference> getOutcomeReference() { return outcomeReference; }
    public void setOutcomeReference(List<OutcomeReference> outcomeReference) { this.outcomeReference = outcomeReference; }

    public List<Target> getTarget() { return target; }
    public void setTarget(List<Target> target) { this.target = target; }

    public Priority getPriority() { return priority; }
    public void setPriority(Priority priority) { this.priority = priority; }

    public String getLifecycleStatus() { return lifecycleStatus; }
    public void setLifecycleStatus(String lifecycleStatus) { this.lifecycleStatus = lifecycleStatus; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getStatusDate() { return statusDate; }
    public void setStatusDate(String statusDate) { this.statusDate = statusDate; }

    public String getStatusReason() { return statusReason; }
    public void setStatusReason(String statusReason) { this.statusReason = statusReason; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
