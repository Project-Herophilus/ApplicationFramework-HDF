package com.ibm.panache;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrganizationInfo extends PanacheEntityBase{

    @Id
    public String id;
    public String name;
    public String resourceType;


}
