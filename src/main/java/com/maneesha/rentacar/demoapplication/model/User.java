package com.maneesha.rentacar.demoapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    private String id;
    private String firstname;
    private String lastname;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
}
