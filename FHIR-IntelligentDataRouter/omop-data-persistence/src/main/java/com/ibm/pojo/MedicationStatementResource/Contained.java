package com.ibm.pojo.MedicationStatementResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contained {
    public String resourceType;
    public String id;
    public String name;
    public Code code;
    public List<Ingredient> ingredient;
    public Batch batch;
    public Form form;

    public Form getForm() { return form; }

    public void setForm(Form form) { this.form = form; }

    public List<Ingredient> getIngredient() { return ingredient; }

    public void setIngredient(List<Ingredient> ingredient) { this.ingredient = ingredient; }

    public Batch getBatch() { return batch; }

    public void setBatch(Batch batch) { this.batch = batch; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
