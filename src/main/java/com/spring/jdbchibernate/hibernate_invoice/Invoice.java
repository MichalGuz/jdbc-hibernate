package com.spring.jdbchibernate.hibernate_invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }

    @Column(name = "NUMBER_OF_INVOICE")
    @NotNull
    public String getNumber() {
        return number;
    }

    @Column(name = "ITEMS")
    @NotNull
    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}
