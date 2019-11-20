package com.spring.jdbchibernate.hibernate_taskList.dao;

import com.spring.jdbchibernate.hibernate_tasklist.TaskList;
import com.spring.jdbchibernate.hibernate_tasklist.dao.TaskListDao;
import org.junit.Test;

public class TaskListDaoTestSuite {

    private TaskListDao taskListDao;
    private static final String DECSRIPTION = "Description for test.";

    @Test
    public void testFindByListName() {
        // given
        TaskList taskList = new TaskList("List #1", DECSRIPTION );


    }
}
