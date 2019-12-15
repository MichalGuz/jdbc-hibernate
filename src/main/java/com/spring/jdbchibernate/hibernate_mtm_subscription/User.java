package com.spring.jdbchibernate.hibernate_mtm_subscription;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "User.retrieveUserWithLastnameEquals",
        query = "FROM User WHERE lastName = :LASTNAME"
)
@Entity
@Table(name = "USERS")
public class User {
    private int id;
    private String firstName;
    private String lastName;

    private List<Subscription> subscriptions = new ArrayList<>();

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Column(name = "FIRSTNAME")
    @NotNull
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "LASTNAME")
    @NotNull
    private String getLastName() {
        return lastName;
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

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
