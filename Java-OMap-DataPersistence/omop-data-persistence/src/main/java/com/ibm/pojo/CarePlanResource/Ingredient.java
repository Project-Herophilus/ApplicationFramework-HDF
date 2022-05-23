package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Ingredient {

    public ItemReference itemReference;

    public ItemReference getItemReference() { return itemReference; }

    public void setItemReference(ItemReference itemReference) { this.itemReference = itemReference; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
