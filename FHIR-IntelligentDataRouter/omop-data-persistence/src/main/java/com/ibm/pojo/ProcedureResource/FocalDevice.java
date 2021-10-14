package com.ibm.pojo.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FocalDevice {

    public Action action;
    public Manipulated manipulated;

    public Action getAction() { return action; }

    public void setAction(Action action) { this.action = action; }

    public Manipulated getManipulated() { return manipulated; }

    public void setManipulated(Manipulated manipulated) { this.manipulated = manipulated; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
