package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Ref;

public class Related {

    public Claim claim;
    public Relationship relationship;
    public Reference reference;

    public Claim getClaim(){return claim;}
    public void setClaim(Claim claim){this.claim=claim;}

    public Relationship getRelationship(){return relationship;}
    public void setRelationship(Relationship relationship){this.relationship=relationship;}

    public Reference getReference(){return reference;}
    public void setReference(Reference reference){this.reference=reference;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
