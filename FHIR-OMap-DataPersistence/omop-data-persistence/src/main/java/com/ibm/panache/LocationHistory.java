package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class LocationHistory extends PanacheEntityBase {

    @Id
    public String location_history_id;
    public String id;
    public int relationship_type_id;
    public String domain_id;
    public BigInteger entity_id;
    public Date start;
    public Date end = null;

}
