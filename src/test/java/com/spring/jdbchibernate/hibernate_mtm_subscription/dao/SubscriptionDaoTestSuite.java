package com.spring.jdbchibernate.hibernate_mtm_subscription.dao;

import com.spring.jdbchibernate.hibernate_mtm_subscription.Subscription;
import com.spring.jdbchibernate.hibernate_mtm_subscription.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriptionDaoTestSuite {
    @Autowired
    SubscriptionDao subscriptionDao;

    @Autowired
    UserDao userDao;

    @Test
    public void testSaveManyToMany() {
        // given
        User adamNovak = new User("Adam", "Novak");
        User marthaLong = new User("Martha", "Long");
        User lauraJones = new User("Laura", "Jones");
        User katieNovak = new User("Katie", "Novak");

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
        news.getUsers().add(katieNovak);
        music.getUsers().add(katieNovak);

        adamNovak.getSubscriptions().add(news);
        adamNovak.getSubscriptions().add(sport);
        marthaLong.getSubscriptions().add(news);
        marthaLong.getSubscriptions().add(music);
        lauraJones.getSubscriptions().add(news);
        lauraJones.getSubscriptions().add(sport);
        lauraJones.getSubscriptions().add(music);
        katieNovak.getSubscriptions().add(music);

        // when
        subscriptionDao.save(news);
        int newsId = news.getId();
        subscriptionDao.save(sport);
        int sportId = sport.getId();
        subscriptionDao.save(music);
        int musicId = music.getId();
        List<User> retrievedWithLastNameEquals = userDao.retrieveUserWithLastNameEquals("Novak");
        List<Subscription> retrievedSubscriptionsWhenFirstThreeLetters = subscriptionDao.retrieveSubscriptionWithFirstThreeLetters();

        // then
        Assert.assertNotEquals(0, newsId);
        Assert.assertNotEquals(0, sportId);
        Assert.assertNotEquals(0, musicId);
        Assert.assertEquals(2, retrievedWithLastNameEquals.size());
        Assert.assertEquals(1, retrievedSubscriptionsWhenFirstThreeLetters.size());

        // cleanUp
        try {
            subscriptionDao.delete(news);
            subscriptionDao.delete(sport);
            subscriptionDao.delete(music);
        } catch (Exception e) {
            // do nothing
        }
    }
}
