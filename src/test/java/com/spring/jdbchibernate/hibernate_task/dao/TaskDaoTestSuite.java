package com.spring.jdbchibernate.hibernate_task.dao;

import com.spring.jdbchibernate.hibernate_task.Task;
import com.spring.jdbchibernate.hibernate_task.TaskFinancialDetails;
import com.spring.jdbchibernate.hibernate_tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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
        // given
        Task task = new Task(DESCRIPTION, 7);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(300), false));

        // when
        taskDao.save(task);
        int id = task.getId();

        // then
        Assert.assertNotEquals(0, id);

        // cleanUp
        taskDao.delete(task);
    }

    @Test
    public void testNamedQueries() {
        // given
        Task task1 = new Task("Study hibernate", 3);
        Task task2 = new Task("Study named query", 6);
        Task task3 = new Task("Study SQL", 9);
        Task task4 = new Task("Write a test",2);

        TaskFinancialDetails details1 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails details2 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails details3 = new TaskFinancialDetails(new BigDecimal(30), false);
        TaskFinancialDetails details4 = new TaskFinancialDetails(new BigDecimal(40), false);

        task1.setTaskFinancialDetails(details1);
        task2.setTaskFinancialDetails(details2);
        task3.setTaskFinancialDetails(details3);
        task4.setTaskFinancialDetails(details4);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);
    }

}
