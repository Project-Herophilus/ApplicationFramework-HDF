package com.ibm.pojo.ImagingStudyRecource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Performer {
    public Function function;
    public Actor actor;

    public Actor getActor() { return actor; }

    public void setActor(Actor actor) { this.actor = actor; }

    public Function getFunction() { return function; }

    public void setFunction(Function function) { this.function = function; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
