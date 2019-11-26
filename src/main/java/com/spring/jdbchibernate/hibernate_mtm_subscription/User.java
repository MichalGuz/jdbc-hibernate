package com.spring.jdbchibernate.hibernate_mtm_subscription;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {
    private int id;
    private String firstname;
    private String lastname;

    private List<Subscription> subscriptions = new ArrayList<>();

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

    @Column(name = "FIRSTNAME)")
    @NotNull
    public String getFirstname() {
        return firstname;
    }

    @Column(name = "LASTNAME")
    @NotNull
    private String getLastname() {
        return lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_SUBSCRIPTION_USER",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "SUBSCRIPTION_ID", referencedColumnName = "SUBSCRIPTION_ID")}
    )
    public List<Subscription> getSubscriptions() {
        return subscriptions;
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

    private void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
