package com.spring.jdbchibernate.hibernate_invoice;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
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

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}


