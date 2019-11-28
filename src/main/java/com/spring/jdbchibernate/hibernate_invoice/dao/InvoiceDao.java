package com.spring.jdbchibernate.hibernate_invoice.dao;

import com.spring.jdbchibernate.hibernate_invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
