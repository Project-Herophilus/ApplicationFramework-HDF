package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CareTeam {

    public int sequence;
    public Provider provider;
    public boolean responsible;
    public Role role;
    public Qualification qualification;

    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}

    public Provider getProvider(){return provider;}
    public void setProvider(Provider provider){this.provider=provider;}
    public boolean isResponsible(){return responsible;}
    public void setResponsible(boolean responsible){this.responsible=responsible;}

    public Role getRole(){return role;}
    public void setRole(Role role){this.role=role;}

    public Qualification getQualification(){return qualification;}
    public void setQualification(Qualification qualification){this.qualification=qualification;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
