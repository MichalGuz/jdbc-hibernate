package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.ProjectEvaluation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProjectEvaluationDaoTestSuite {
    ProjectEvaluationDao projectEvaluationDao;

    @Test
    public void testFindByPositive() {
        // given
        ProjectEvaluation projectEvaluation = new ProjectEvaluation(true, true, 45, true, 15, true);
        projectEvaluationDao.save(projectEvaluation);
        int id = projectEvaluation.getId();
    }
}
