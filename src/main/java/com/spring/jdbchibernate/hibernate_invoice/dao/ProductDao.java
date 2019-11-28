package com.spring.jdbchibernate.hibernate_invoice.dao;

import com.spring.jdbchibernate.hibernate_invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
}
