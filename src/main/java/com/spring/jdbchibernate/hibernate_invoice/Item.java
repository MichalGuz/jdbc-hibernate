package com.spring.jdbchibernate.hibernate_invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    private Product product;
    private Invoice invoice;

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public Item() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID")
    public int getId() {
        return id;
    }

    @Column(name = "PRICES")
    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QUANTITY")
    @NotNull
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUES")
    @NotNull
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCTS")
    @NotNull
    public Product getProduct() {
        return product;
    }

    @OneToMany
    @JoinColumn(name = "INVOICES")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
