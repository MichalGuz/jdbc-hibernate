package com.spring.jdbchibernate.hibernate_project;

public class ProjectEvaluation {
    private int id;
    private boolean formal;
    private boolean meritoric;
    private int meritScore;
    private boolean financialAnalysis;
    private int finAnaScore;
    private boolean positive;

    public ProjectEvaluation(boolean formal, boolean meritoric, int meritScore, boolean financialAnalysis, int finAnaScore, boolean positive) {
        this.formal = formal;
        this.meritoric = meritoric;
        this.meritScore = meritScore;
        this.financialAnalysis = financialAnalysis;
        this.finAnaScore = finAnaScore;
        this.positive = positive;
    }

    public ProjectEvaluation() {
    }

    public int getId() {
        return id;
    }

    public boolean isFormal() {
        return formal;
    }

    public boolean isMeritoric() {
        return meritoric;
    }

    public int getMeritScore() {
        return meritScore;
    }

    public boolean isFinancialAnalysis() {
        return financialAnalysis;
    }

    public int getFinAnaScore() {
        return finAnaScore;
    }

    public boolean isPositive() {
        return positive;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFormal(boolean formal) {
        this.formal = formal;
    }

    private void setMeritoric(boolean meritoric) {
        this.meritoric = meritoric;
    }

    private void setMeritScore(int meritScore) {
        this.meritScore = meritScore;
    }

    private void setFinancialAnalysis(boolean financialAnalysis) {
        this.financialAnalysis = financialAnalysis;
    }

    private void setFinAnaScore(int finAnaScore) {
        this.finAnaScore = finAnaScore;
    }

    private void setPositive(boolean positive) {
        this.positive = positive;
    }
}