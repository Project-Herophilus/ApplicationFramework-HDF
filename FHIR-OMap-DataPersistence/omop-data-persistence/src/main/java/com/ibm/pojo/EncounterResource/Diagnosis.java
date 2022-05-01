package com.ibm.pojo.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Diagnosis {

    public Condition condition;
    public Use use;
    public int rank;

    public Condition getCondition(){return condition;}
    public void setCondition(Condition condition){this.condition=condition;}

    public Use getUse(){return use;}
    public void setUse(Use use){this.use=use;}

    public int getRank(){return rank;}
    public void setRank(int rank){this.rank=rank;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
