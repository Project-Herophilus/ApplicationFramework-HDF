package com.ibm.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.apache.kafka.common.protocol.types.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ObservationPeriod extends PanacheEntityBase {

    @Id
    public String id;
    public String person_id;
    public String start_date;
    public String end_date;
    public String period_type_id;
}
