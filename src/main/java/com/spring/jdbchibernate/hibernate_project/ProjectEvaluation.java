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
}
