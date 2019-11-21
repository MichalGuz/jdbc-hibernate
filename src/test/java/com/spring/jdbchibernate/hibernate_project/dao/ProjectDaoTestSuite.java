package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProjectDaoTestSuite {

    ProjectDao projectDao;

    @Test
    public void testFindByTitleAndChecksum(){
        // given
        Project project = new Project("Title #1", new BigDecimal("2000000"), new BigDecimal("1500000"), "EFFR", "1234123456");
        projectDao.save(project);

    }
}
