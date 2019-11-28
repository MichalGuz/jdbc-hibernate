package com.spring.jdbchibernate.hibernate_invoice.dao;

import com.spring.jdbchibernate.hibernate_invoice.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, Integer> {
}
