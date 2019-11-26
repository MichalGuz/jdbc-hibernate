package com.spring.jdbchibernate.hibernate_mtm_subscription;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SUBSCRIPTIONS")
public class Subsciption {
    private int id;
    private String name;

    public Subsciption(String name) {
        this.name = name;
    }

    public Subsciption() {
    }

    @Id
    @GeneratedValue
    @Column(name = "SUBSCRIPTION_ID")
    @NotNull
    public int getId() {
        return id;
    }

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
