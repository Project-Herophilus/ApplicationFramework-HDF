package com.ibm.pojo.ClaimResource;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Name {
    public String use;
    public String family;
    public List<String> given;


    public String getFamily(){return family;}
    public void setFamily(String family){this.family=family;}

    public List<String> getGiven(){return given;}
    public void setGiven(List<String> given){this.given=given;}

    public String getUse(){return use;}
    public void setUse(String use){this.use=use;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
