package com.spring.jdbchibernate.hibernate_beneficiary;

public class Beneficiary {
    private int id;
    private String name;
    private int editorKey;

    public Beneficiary(String name, int editorKey) {
        this.name = name;
        this.editorKey = editorKey;
    }
}
