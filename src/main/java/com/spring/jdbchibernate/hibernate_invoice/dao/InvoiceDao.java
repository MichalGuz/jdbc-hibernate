package com.spring.jdbchibernate.hibernate_invoice.dao;

import com.spring.jdbchibernate.hibernate_invoice.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
