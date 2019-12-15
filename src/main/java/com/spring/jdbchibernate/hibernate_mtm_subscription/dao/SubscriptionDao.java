package com.spring.jdbchibernate.hibernate_mtm_subscription.dao;

import com.spring.jdbchibernate.hibernate_mtm_subscription.Subscription;
import com.spring.jdbchibernate.hibernate_mtm_subscription.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface SubscriptionDao extends CrudRepository<Subscription, Integer> {
    @Query
    List<Subscription> retrieveSubscriptionWithFirstThreeLetters()
}
