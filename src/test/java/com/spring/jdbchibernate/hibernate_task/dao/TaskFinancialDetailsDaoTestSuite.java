package com.spring.jdbchibernate.hibernate_task.dao;

import com.spring.jdbchibernate.hibernate_task.TaskFinancialDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskFinancialDetailsDaoTestSuite {
    TaskFinacialDetailsDao taskFinacialDetailsDao;

    @Test
    public void testFindByPaid() {
        // given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinacialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        // when
        List<TaskFinancialDetails> results = taskFinacialDetailsDao.findByPaid(false);
    }
}
