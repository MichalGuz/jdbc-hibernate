package com.spring.jdbchibernate.hibenate_task.dao;

import com.spring.jdbchibernate.hibernate_task.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task, Integer> {
}
