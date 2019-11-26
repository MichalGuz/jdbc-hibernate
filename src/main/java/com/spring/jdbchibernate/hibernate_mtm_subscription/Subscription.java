package com.spring.jdbchibernate.hibernate_mtm_subscription;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SUBSCRIPTIONS")
public class Subscription {
    private int id;
    private String name;

    private List<User> users = new ArrayList<>();

    public Subscription(String name) {
        this.name = name;
    }

    public Subscription() {
    }

    @Id
    @GeneratedValue
    @Column(name = "SUBSCRIPTION_ID", unique = true)
    @NotNull
    public int getId() {
        return id;
    }

    @Column(name = "SUBSCRIPTION_NAME")
    @NotNull
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
