package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Ingredient {
    public Item item;
    public Boolean isActive;
    public int ratio;

    public Item getItem() { return item; }

    public void setItem(Item item) { this.item = item; }

    public Boolean getActive() { return isActive; }

    public void setActive(Boolean active) { isActive = active; }

    public int getRatio() { return ratio; }

    public void setRatio(int ratio) { this.ratio = ratio; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
