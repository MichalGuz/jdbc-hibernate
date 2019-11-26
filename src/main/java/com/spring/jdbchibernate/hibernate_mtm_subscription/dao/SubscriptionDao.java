package com.spring.jdbchibernate.hibernate_mtm_subscription.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface SubscriptionDao extends CrudRepository {
}
