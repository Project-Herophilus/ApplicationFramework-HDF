package com.ibm.pojo.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EncounterLocation {
    public String display;
    public Location location;
    public String status;
    public Period period;
    public PhysicalType physicalType;

    public String getDisplay(){return display;}
    public void setDisplay(String display){this.display=display;}

    public Location getLocation(){return location;}
    public void setLocation(Location location){this.location=location;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}

    public PhysicalType getPhysicalType(){return physicalType;}
    public void setPhysicalType(PhysicalType physicalType){this.physicalType=physicalType;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
