package com.spring.jdbchibernate.hibernate_taskList.dao;

import com.spring.jdbchibernate.hibernate_tasklist.TaskList;
import com.spring.jdbchibernate.hibernate_tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TaskListDaoTestSuite {

    private TaskListDao taskListDao;
    private static final String DECSRIPTION = "Description for test.";

    @Test
    public void testFindByListName() {
        // given
        TaskList taskList = new TaskList("List #1", DECSRIPTION );
        taskListDao.save(taskList);
        String nameOfList = taskList.getListName();

        // when
        List<TaskList> readTaskList = taskListDao.findByListName(nameOfList);

        // then
        Assert.assertEquals(1, readTaskList.size());

        // cleanUp
        taskListDao.delete(taskList);
    }
}
