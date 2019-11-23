package com.spring.jdbchibernate.hibernate_task.dao;

import com.spring.jdbchibernate.hibernate_task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskFinacialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
