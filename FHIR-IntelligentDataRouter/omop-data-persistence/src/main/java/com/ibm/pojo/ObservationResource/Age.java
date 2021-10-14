package com.ibm.pojo.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Age {

    public Age age;

    public Age getAge(){return age;}
    public void setAge(Age age){this.age=age;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
