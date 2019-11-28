package com.spring.jdbchibernate.hibernate_invoice;

import java.math.BigDecimal;

public class Item {
    int id;
    Product product;
    BigDecimal price;
    int quantity;
    BigDecimal value;

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public Item() {
    }
}
