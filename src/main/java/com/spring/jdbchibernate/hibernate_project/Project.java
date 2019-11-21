package com.spring.jdbchibernate.hibernate_project;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "PROJECTS")
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

    public Project() {
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Column(name = "TITLE")
    @NotNull
    public String getTitle() {
        return title;
    }

    @Column(name = "WORTH_OF_PROJECT")
    @NotNull
    public BigDecimal getWorthOfProject() {
        return worthOfProject;
    }

    @Column(name = "WORTH_OF_GRANT")
    public BigDecimal getWorthOfGrant() {
        return worthOfGrant;
    }

    @Column(name = "FUND")
    public String getFund() {
        return fund;
    }

    public Date getApplied() {
        return applied;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWorthOfProject(BigDecimal worthOfProject) {
        this.worthOfProject = worthOfProject;
    }

    public void setWorthOfGrant(BigDecimal worthOfGrant) {
        this.worthOfGrant = worthOfGrant;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public void setApplied(Date applied) {
        this.applied = applied;
    }
}


