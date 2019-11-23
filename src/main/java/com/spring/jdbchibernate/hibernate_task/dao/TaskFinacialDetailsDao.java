package com.spring.jdbchibernate.hibernate_task.dao;

import com.spring.jdbchibernate.hibernate_task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskFinacialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
