package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.Project;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProjectDaoTestSuite {

    @Autowired
    ProjectDao projectDao;

    @Test
    public void testFindByTitleAndChecksum(){
        // given
        Project project = new Project("PL2019010200001", "Title #1", new BigDecimal(2000000), new BigDecimal(1500000), "EFFR", "1234123456");
        projectDao.save(project);
        String retrievedTitle = project.getTitle();
        String retrievedChecksum = project.getChecksum();

        // when
        List<Project> projects = projectDao.findByTitleAndChecksum(retrievedTitle, retrievedChecksum);

        // then
        Assert.assertEquals(1, projects.size());

        // cleanUp
        projectDao.delete(project);
    }

    @Test
    public void testProjectDaoSaveWithProjectEvaluation() {

    }
}
