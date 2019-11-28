package com.spring.jdbchibernate.hibernate_invoice;

import java.util.List;

public class Invoice {
    int id;
    String number;
    List<Item> items;

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    public Invoice() {
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<Item> getItems() {
        return items;
    }
}
