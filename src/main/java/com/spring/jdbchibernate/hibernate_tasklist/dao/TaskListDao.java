package com.spring.jdbchibernate.hibernate_tasklist.dao;

import com.spring.jdbchibernate.hibernate_tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TaskListDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
