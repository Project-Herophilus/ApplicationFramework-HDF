package com.ibm.pojo.SpecimenResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Container {
    public List<Identifier> identifier;
    public String description;
    public Type type;
    public Capacity capacity;
    public SpecimenQuantity specimenQuantity;
    public AdditiveReference additiveReference;

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Identifier> getIdentifier() { return identifier; }

    public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }

    public AdditiveReference getAdditiveReference() { return additiveReference; }

    public void setAdditiveReference(AdditiveReference additiveReference) { this.additiveReference = additiveReference; }

    public SpecimenQuantity getSpecimenQuantity() { return specimenQuantity; }

    public void setSpecimenQuantity(SpecimenQuantity specimenQuantity) { this.specimenQuantity = specimenQuantity; }

    public Capacity getCapacity() {return capacity; }

    public void setCapacity(Capacity capacity) { this.capacity = capacity; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
