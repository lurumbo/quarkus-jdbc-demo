package org.pigmalion;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends PanacheEntity {

    /* Panache handler the id property automatically, so there is no need for declare it */
    // public Long id;

    @Column
    public String name;

}
