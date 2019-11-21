package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectDao extends CrudRepository<Project, Integer> {

}
