package com.ibm.pojo.LocationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Position {
    public double longitude;
    public double latitude;
    public int altitude;

    public double getLatitude() { return latitude; }

    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude; }

    public int getAltitude() { return altitude; }

    public void setAltitude(int altitude) { this.altitude = altitude; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }
}
