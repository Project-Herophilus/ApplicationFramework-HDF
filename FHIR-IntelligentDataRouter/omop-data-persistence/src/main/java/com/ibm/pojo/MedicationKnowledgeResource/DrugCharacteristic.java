package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DrugCharacteristic {
    public Type type;
    public Value value;

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public Value getValue() { return value; }

    public void setValue(Value value) { this.value = value; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
