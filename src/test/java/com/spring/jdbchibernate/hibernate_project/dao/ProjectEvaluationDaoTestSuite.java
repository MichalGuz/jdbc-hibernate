package com.spring.jdbchibernate.hibernate_project.dao;

import com.spring.jdbchibernate.hibernate_project.ProjectEvaluation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

        // when
        List<ProjectEvaluation> resultList = projectEvaluationDao.findByPositive(true);

        // then
        Assert.assertEquals(1, resultList);

        // cleanUp
        projectEvaluationDao.delete(projectEvaluation);
    }
}
