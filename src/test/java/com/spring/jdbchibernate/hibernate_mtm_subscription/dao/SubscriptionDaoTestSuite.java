package com.spring.jdbchibernate.hibernate_mtm_subscription.dao;

import com.spring.jdbchibernate.hibernate_mtm_subscription.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriptionDaoTestSuite {
    SubscriptionDao subscriptionDao;

    @Test
    public void testSaveManyToMany() {
        // given
        User adamNovak = new User("Adam", "Novak");
        User marthaLong = new User("Matha", "Long");
        User lauraJones = new User("Laura", "Jones")
    }
}
