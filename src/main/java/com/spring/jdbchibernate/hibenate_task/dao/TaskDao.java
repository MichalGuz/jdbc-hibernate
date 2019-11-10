package com.spring.jdbchibernate.hibenate_task.dao;

import com.spring.jdbchibernate.hibernate_task.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
