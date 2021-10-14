package com.ibm.pojo.MedicationDispenseResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contained {
    public String resourceType;
    public String id;
    public Code code;
    public Form form;
    public List<Ingredient> ingredient;
    public Manufacturer manufacturer;

    public Manufacturer getManufacturer() { return manufacturer; }

    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    public List<Ingredient> getIngredient() { return ingredient; }

    public void setIngredient(List<Ingredient> ingredient) { this.ingredient = ingredient; }

    public Form getForm() { return form; }

    public void setForm(Form form) { this.form = form; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
