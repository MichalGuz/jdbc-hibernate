package com.spring.jdbchibernate.hibernate_beneficiary;

import com.spring.jdbchibernate.hibernate_project.Project;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BENEFICIARIES")
public class Beneficiary {
    private int id;
    private String name;
    private int editorKey;
    private List<Project> projects = new ArrayList<>();

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

    @OneToMany(
            targetEntity = Project.class,
            mappedBy = "beneficiary",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    public List<Project> getProjects() {
        return projects;
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

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
