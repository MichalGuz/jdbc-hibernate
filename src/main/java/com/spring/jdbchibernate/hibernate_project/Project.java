package com.spring.jdbchibernate.hibernate_project;

import com.spring.jdbchibernate.hibernate_beneficiary.Beneficiary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "PROJECTS")
public class Project {
    private int id;
    private String projectNumber;
    private String title;
    private BigDecimal worthOfProject;
    private BigDecimal worthOfGrant;
    private String fund;
    private Date applied;
    private String checksum;

    private ProjectEvaluation projectEvaluation;

    private Beneficiary beneficiary;

    public Project(String projectNumber, String title, BigDecimal worthOfProject, BigDecimal worthOfGrant, String fund, String checksum) {
        this.projectNumber = projectNumber;
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

    @Column(name = "PROJECT_NUMBER", unique = true)
    @NotNull
    public String getProjectNumber() {
        return projectNumber;
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

    @Column(name = "CHECKSUM", unique = true)
    @NotNull
    public String getChecksum() {
        return checksum;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PROJECT_EVALUATION_ID")
    public ProjectEvaluation getProjectEvaluation() {
        return projectEvaluation;
    }

    @ManyToOne
    @JoinColumn(name = "BENEFICIARY_ID")
    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    private void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setWorthOfProject(BigDecimal worthOfProject) {
        this.worthOfProject = worthOfProject;
    }

    private void setFund(String fund) {
        this.fund = fund;
    }

    private void setWorthOfGrant(BigDecimal worthOfGrant) {
        this.worthOfGrant = worthOfGrant;
    }

    private void setApplied(Date applied) {
        this.applied = applied;
    }

    public void setProjectEvaluation(ProjectEvaluation projectEvaluation) {
        this.projectEvaluation = projectEvaluation;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }
}


