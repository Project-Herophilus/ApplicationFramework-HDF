package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Price extends PanacheEntity {

    public int value;

}
