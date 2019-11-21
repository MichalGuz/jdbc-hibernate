package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ProjectDao extends CrudRepository<Project, Integer> {
    List<Project> findByTitleAndChecksum(String title, String checksum);
}
