package com.spring.jdbchibernate.hibernate_mtm_subscription.dao;

import com.spring.jdbchibernate.hibernate_mtm_subscription.Subscription;
import com.spring.jdbchibernate.hibernate_mtm_subscription.User;
import org.junit.Assert;
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
        User lauraJones = new User("Laura", "Jones");

        Subscription news = new Subscription("News");
        Subscription sport = new Subscription("Sport");
        Subscription music = new Subscription("Music");

        news.getUsers().add(adamNovak);
        sport.getUsers().add(adamNovak);
        news.getUsers().add(marthaLong);
        music.getUsers().add(marthaLong);
        news.getUsers().add(lauraJones);
        sport.getUsers().add(lauraJones);
        music.getUsers().add(lauraJones);

        adamNovak.getSubscriptions().add(news);
        adamNovak.getSubscriptions().add(sport);
        marthaLong.getSubscriptions().add(news);
        marthaLong.getSubscriptions().add(music);
        lauraJones.getSubscriptions().add(news);
        lauraJones.getSubscriptions().add(sport);
        lauraJones.getSubscriptions().add(music);

        // when
        subscriptionDao.save(news);
        int newsId = news.getId();
        subscriptionDao.save(sport);
        int sportId = sport.getId();
        subscriptionDao.save(music);
        int musicId = music.getId();

        // then
        Assert.assertNotEquals(0, newsId);
        Assert.assertNotEquals(0, sportId);
        Assert.assertNotEquals(0, musicId);

    }
}
