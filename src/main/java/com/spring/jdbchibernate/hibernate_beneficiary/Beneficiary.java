package com.spring.jdbchibernate.hibernate_beneficiary;

public class Beneficiary {
    private int id;
    private String name;
    private int editorKey;

    public Beneficiary(String name, int editorKey) {
        this.name = name;
        this.editorKey = editorKey;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEditorKey() {
        return editorKey;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEditorKey(int editorKey) {
        this.editorKey = editorKey;
    }
}
