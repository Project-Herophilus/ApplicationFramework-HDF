package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClaimHDR extends PanacheEntityBase {

    @Id
    public String id;
    public String resourceType;
    public String status;
    public double claimAmount;
    public String currency;
    public String patientRef;

}
