package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MeasureTest extends PanacheEntityBase{


    @Id
    public String id;
    public String name;
    public String groups;
    public String date;
    public String code;
    public String description;
    public String publisher;
    public String purpose;
    public String type;


}
