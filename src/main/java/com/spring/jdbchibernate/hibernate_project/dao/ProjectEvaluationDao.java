package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.ProjectEvaluation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ProjectEvaluationDao extends CrudRepository<ProjectEvaluation, Integer> {
    List<ProjectEvaluation> findByPositive(boolean positive);
}
