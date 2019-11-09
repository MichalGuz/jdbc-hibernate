package com.spring.jdbchibernate.hibernate_task;

import java.util.Date;

public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task(int id, String description, Date created, int duration) {
        this.id = id;
        this.description = description;
        this.created = created;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreated() {
        return created;
    }

    public int getDuration() {
        return duration;
    }
}
