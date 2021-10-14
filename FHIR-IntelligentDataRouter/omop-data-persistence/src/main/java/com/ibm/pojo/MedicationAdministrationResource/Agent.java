package com.ibm.pojo.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Agent {
    public List<Role> role;
    public Who who;

    public List<Role> getRole() { return role; }

    public void setRole(List<Role> role) { this.role = role; }

    public Who getWho() { return who; }

    public void setWho(Who who) { this.who = who; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
