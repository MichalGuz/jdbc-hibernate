package com.spring.jdbchibernate.hibernate_beneficiary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BENEFICIARIES")
public class Beneficiary {
    private int id;
    private String name;
    private int editorKey;

    public Beneficiary(String name, int editorKey) {
        this.name = name;
        this.editorKey = editorKey;
    }

    public Beneficiary() {
    }

    @Column(name = "ID")
    @NotNull
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    @NotNull
    public String getName() {
        return name;
    }

    @Column(name = "EDITOR_KEY")
    @NotNull
    public int getEditorKey() {
        return editorKey;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEditorKey(int editorKey) {
        this.editorKey = editorKey;
    }
}
