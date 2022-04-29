package com.ibm.pojo.MedicationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Medication {
    public String resourceType;
    public String id;
    public String status;
    public Text text;
    public Code code;
    public List<Contained> contained;
    public Manufacturer manufacturer;
    public Form form;
    public List<Ingredient> ingredient;
    public Batch batch;
    public Amount amount;
    public Identifier identifier;

    public Identifier getIdentifier() { return identifier; }
    public void setIdentifier(Identifier identifier) { this.identifier = identifier; }

    public Amount getAmount() { return amount; }
    public void setAmount(Amount amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Manufacturer getManufacturer() { return manufacturer; }
    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    public List<Ingredient> getIngredient() { return ingredient; }
    public void setIngredient(List<Ingredient> ingredient) { this.ingredient = ingredient; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public Form getForm() { return form; }
    public void setForm(Form form) { this.form = form; }

    public Batch getBatch() { return batch; }
    public void setBatch(Batch batch) { this.batch = batch; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

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
