package com.spring.jdbchibernate.hibernate_mtm_subscription;

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
}
