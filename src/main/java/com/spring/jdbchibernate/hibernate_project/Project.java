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
    private String checksum;

    public Project(String title, BigDecimal worthOfProject, BigDecimal worthOfGrant, String fund, String checksum) {
        this.title = title;
        this.fund = fund;
        this.applied = new Date();
        this.worthOfProject = worthOfProject;
        this.worthOfGrant= worthOfGrant;
        this.checksum = checksum;
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

    @Column(name = "APPLIED")
    public Date getApplied() {
        return applied;
    }

    @Column(name = "CHECKSUM")
    @NotNull
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
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


