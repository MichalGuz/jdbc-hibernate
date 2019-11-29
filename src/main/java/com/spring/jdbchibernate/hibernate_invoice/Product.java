package com.spring.jdbchibernate.hibernate_invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;

    private Item item;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID")
    public int getId() {
        return id;
    }

    @Column(name = "PRODUCT_NAME")
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

    public Item getItem() {
        return item;
    }
}


