package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.ProjectEvaluation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectEvaluationDao extends CrudRepository<ProjectEvaluation, Integer> {
    List<ProjectEvaluation> findByPositive(boolean positive);
}
