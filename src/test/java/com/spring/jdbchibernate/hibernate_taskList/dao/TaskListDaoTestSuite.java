package com.spring.jdbchibernate.hibernate_taskList.dao;

import com.spring.jdbchibernate.hibernate_task.Task;
import com.spring.jdbchibernate.hibernate_task.TaskFinancialDetails;
import com.spring.jdbchibernate.hibernate_tasklist.TaskList;
import com.spring.jdbchibernate.hibernate_tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Description for test.";

    @Test
    public void testFindByListName() {
        // given
        TaskList taskList = new TaskList("List #1", DESCRIPTION);
        taskListDao.save(taskList);
        String nameOfList = taskList.getListName();

        // when
        List<TaskList> readTaskList = taskListDao.findByListName(nameOfList);

        // then
        Assert.assertEquals(1, readTaskList.size());

        // cleanUp
        taskListDao.delete(taskList);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        // given
        Task task1 = new Task("Task for three weeks", 21);
        Task task2 = new Task("Task for one month", 31);
        Task task3 = new Task("Task fot one year", 365);
        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(3000), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(4000), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(50000), false);
        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        TaskList taskList = new TaskList("List #1", "To do tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
    }
}
