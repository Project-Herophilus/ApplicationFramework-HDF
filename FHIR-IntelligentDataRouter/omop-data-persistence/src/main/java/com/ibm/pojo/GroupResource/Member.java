package com.ibm.pojo.GroupResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Member {
    public Entity entity;
    public Period period;
    public boolean inactive;

    public Entity getEntity(){return entity;}
    public void setEntity(Entity entity){this.entity=entity;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public boolean isInactive(){return inactive;}
    public void setInactive(boolean inactive){this.inactive=inactive;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
