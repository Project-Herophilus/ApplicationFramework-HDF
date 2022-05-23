package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Allergy extends PanacheEntityBase {

    @Id
    public String id;
    public String start=null;
    public String stop=null;
    public String patient=null;
    public String encounter=null;
    public String code=null;
    public String description=null;
}
