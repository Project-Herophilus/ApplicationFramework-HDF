package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Insurance {

    public int sequence;
    public boolean focal;
    public Identifier identifier;
    public Coverage coverage;
    public List<String> preAuthRef;
    public ClaimResponse claimResponse;
    public String businessArrangement;

    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}
    public boolean isFocal(){return focal;}
    public void setFocal(boolean focal){this.focal=focal;}


    public Identifier getIdentifier(){return identifier;}
    public void setIdentifier(Identifier identifier){this.identifier=identifier;}

    public Coverage getCoverage(){return coverage;}
    public void setCoverage(Coverage coverage){this.coverage=coverage;}

    public List<String> getPreAuthRef(){return preAuthRef;}
    public void setPreAuthRef(List<String> preAuthRef){this.preAuthRef=preAuthRef;}

    public ClaimResponse getClaimResponse(){return claimResponse;}
    public void setClaimResponse(ClaimResponse claimResponse){this.claimResponse=claimResponse;}

    public String getBusinessArrangement(){return  businessArrangement;}
    public void setBusinessArrangement(String businessArrangement){this.businessArrangement=businessArrangement;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
