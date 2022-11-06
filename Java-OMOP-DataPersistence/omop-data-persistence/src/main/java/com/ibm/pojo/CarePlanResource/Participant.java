package com.ibm.pojo.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Participant {

    public List<Role> role;
    public Member member;

    public List<Role> getRole() { return role; }

    public void setRole(List<Role> role) { this.role = role; }

    public Member getMember() { return member; }

    public void setMember(Member member) { this.member = member; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
