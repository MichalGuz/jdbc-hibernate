package com.spring.jdbchibernate.hibernate_project;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private int id;
    private String title;
    private BigDecimal worthOfProject;
    private BigDecimal worthOfGrant;
    private String fund;
    private Date applied;

    public Project(String title, BigDecimal worthOfProject, BigDecimal worthOfGrant, String fund) {
        this.title = title;
        this.fund = fund;
        this.applied = new Date();
        this.worthOfProject = worthOfProject;
        this.worthOfGrant= worthOfGrant;
    }
}
