package com.ibm.panache;
import com.ibm.pojo.LocationResource.Location;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class LocationStorage {

    @Incoming("fhirsvr_location")
    @Blocking
    @Transactional
    public void store(Location location){
        LocationInfo locationInfo = new LocationInfo();
        String id = "";
        String address_1 = "";
        String address_2= "";
        String city = "";
        String state = "";
        String zip = "";
        String country = "";
        double latitude = 0;
        double longitude = 0;

        try {
            id = location.getId();
            locationInfo.id = id;
            address_1 = location.getAddress().toString();
            address_2= location.getAddress().toString();
            locationInfo.address_1 = address_1;
            locationInfo.address_2 = address_2;
            city = location.getAddress().getCity();
            locationInfo.city = city;
            state = location.getAddress().getState();
            locationInfo.state = state;
            zip = location.getAddress().getPostalCode();
            locationInfo.zip = zip;
            country = location.getAddress().getCountry();
            locationInfo.country = country;
            latitude = location.getPosition().getLatitude();
            locationInfo.latitude = latitude;
            longitude = location.getPosition().getLongitude();
            locationInfo.longitude = longitude;
        }catch (NullPointerException e){
            id = location.getId();
            locationInfo.id = null;
            locationInfo.address_1 = null;
            locationInfo.address_2 = null;
            locationInfo.city = null;
            locationInfo.state = null;
            locationInfo.zip = null;
            locationInfo.country = null;
            locationInfo.latitude = 0;
            locationInfo.longitude = 0;
        }
        LocationInfo locationId = LocationInfo.findLocation(location.getId());
        if(locationId !=null){
            System.out.println("Existing record");
            LocationInfo.update("address_1=?1,address_2=?2,city=?3,state=?4,zip=?5,country=?6,latitude=?7,longitude=?8 where id=?9",
                    address_1,address_2,city,state,zip,country,latitude,longitude,id);
        } else{
            System.out.println("New Record");
            locationInfo.persist();

        }
    }
}
