package com.ibm.pojo.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

public class Contained {
    public String resourceType;
    public String id;
    public String code;
    public List<Target> target;
    public Date recorded;
    public List<Agent> agent;
    public List<Signature> signature;
    public Form form;
    public List<Ingredient> ingredient;
    public Batch batch;

    public Batch getBatch() { return batch; }

    public void setBatch(Batch batch) { this.batch = batch; }

    public Form getForm() { return form; }

    public void setForm(Form form) { this.form = form; }

    public List<Ingredient> getIngredient() { return ingredient; }

    public void setIngredient(List<Ingredient> ingredient) { this.ingredient = ingredient; }

    public Date getRecorded() { return recorded; }

    public void setRecorded(Date recorded) { this.recorded = recorded; }

    public List<Agent> getAgent() { return agent; }

    public void setAgent(List<Agent> agent) { this.agent = agent; }

    public List<Signature> getSignature() { return signature; }

    public void setSignature(List<Signature> signature) { this.signature = signature; }

    public List<Target> getTarget() { return target; }

    public void setTarget(List<Target> target) { this.target = target; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
