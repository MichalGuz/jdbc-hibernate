package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.Project;
import com.spring.jdbchibernate.hibernate_project.ProjectEvaluation;
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
    private static Project PROJECT = new Project("PL2019010200001", "Title #1", new BigDecimal(2000000), new BigDecimal(1500000), "EFFR", "1234123456");

    @Test
    public void testFindByTitleAndChecksum(){
        // given
        projectDao.save(PROJECT);
        String retrievedTitle = PROJECT.getTitle();
        String retrievedChecksum = PROJECT.getChecksum();

        // when
        List<Project> projects = projectDao.findByTitleAndChecksum(retrievedTitle, retrievedChecksum);

        // then
        Assert.assertEquals(1, projects.size());

        // cleanUp
        projectDao.delete(PROJECT);
    }

    @Test
    public void testProjectDaoSaveWithProjectEvaluation() {
        // given
        PROJECT.setProjectEvaluation(new ProjectEvaluation(true, true, 18, true, 30, true));

        // when
        projectDao.save(PROJECT);
        int id = PROJECT.getId();

        // then
        Assert.assertNotEquals(0, id);
    }
}
