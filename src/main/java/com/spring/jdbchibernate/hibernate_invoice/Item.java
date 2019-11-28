package com.spring.jdbchibernate.hibernate_invoice;

import java.math.BigDecimal;

public class Item {
    int id;
    Product product;
    BigDecimal price;
    int quantity;
    BigDecimal value;
}
