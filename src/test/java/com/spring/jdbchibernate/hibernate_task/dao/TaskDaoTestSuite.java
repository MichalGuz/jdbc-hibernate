package com.spring.jdbchibernate.hibernate_task.dao;

import com.spring.jdbchibernate.hibernate_task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: practise Hibernate.";

    @Test
    public void testTaskDaoSave() {
        // given
        Task task = new Task(DESCRIPTION, 2);

        // when
        taskDao.save(task);

        // then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assert.assertEquals(id, readTask.get().getId() );

        // cleanUp
        taskDao.delete(task);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        // given
        Task task = new Task(DESCRIPTION, 2);
        taskDao.save(task);
        int duration = task.getDuration();

        // when
        List<Task> readTasks = taskDao.findByDuration(duration);

        // then
        Assert.assertEquals(1, readTasks.size());

        // cleanUp
        taskDao.delete(task);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {

    }
}
