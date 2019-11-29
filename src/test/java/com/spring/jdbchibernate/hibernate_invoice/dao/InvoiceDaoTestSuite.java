package com.spring.jdbchibernate.hibernate_invoice.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    ProductDao productDao;
    ItemDao itemDao;
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

    }
}
