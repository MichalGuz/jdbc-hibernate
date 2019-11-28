package com.spring.jdbchibernate.hibernate_invoice.dao;

import com.spring.jdbchibernate.hibernate_invoice.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
