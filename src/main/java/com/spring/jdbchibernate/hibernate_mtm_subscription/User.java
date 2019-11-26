package com.spring.jdbchibernate.hibernate_mtm_subscription;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
    private int id;
    private String firstname;
    private String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String getLastname() {
        return lastname;
    }
}
