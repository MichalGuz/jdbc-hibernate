package com.spring.jdbchibernate.hibernate_task.dao;

import com.spring.jdbchibernate.hibenate_task.dao.TaskDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: practise Hibernate.";

    @Test
    public void testTaskDaoSave() {

    }
}
