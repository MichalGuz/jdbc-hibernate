package com.spring.jdbchibernate.hibernate_invoice;

public class Product {
    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


