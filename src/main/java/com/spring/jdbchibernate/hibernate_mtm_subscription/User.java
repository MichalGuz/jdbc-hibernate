package com.spring.jdbchibernate.hibernate_mtm_subscription;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @Id
    @Column(name = "USER_ID", unique = true)
    @NotNull
    @GeneratedValue
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
