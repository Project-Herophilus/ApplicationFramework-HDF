package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Cost {
    public Type type;
    public Source source;
    public int cost;

    public int getCost() { return cost; }

    public void setCost(int cost) { this.cost = cost; }

    public Source getSource() { return source; }

    public void setSource(Source source) { this.source = source; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
