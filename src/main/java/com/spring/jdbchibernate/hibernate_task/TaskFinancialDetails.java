package com.spring.jdbchibernate.hibernate_task;

import java.math.BigDecimal;

public class TaskFinancialDetails {
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {}

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isPaid() {
        return paid;
    }
}
