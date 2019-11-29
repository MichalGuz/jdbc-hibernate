package com.spring.jdbchibernate.hibernate_invoice.dao;


import com.spring.jdbchibernate.hibernate_invoice.Invoice;
import com.spring.jdbchibernate.hibernate_invoice.Item;
import com.spring.jdbchibernate.hibernate_invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    ProductDao productDao;
    ItemDao itemDao;
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        // given
        Product product1 = new Product("water");
        Product product2 = new Product("cola");
        Product product3 = new Product("tonic");

        Item item1 = new Item(new BigDecimal("4"), 1000, new BigDecimal("4000"));
        Item item2 = new Item(new BigDecimal("6"), 500, new BigDecimal("3000"));
        Item item3 = new Item(new BigDecimal("5"), 500, new BigDecimal("2500"));
        Item item4 = new Item(new BigDecimal("4"), 5000, new BigDecimal("10000"));
        Item item5 = new Item(new BigDecimal("6"), 1000, new BigDecimal("6000"));
        Item item6 = new Item(new BigDecimal("5"), 200, new BigDecimal("1000"));

        Invoice invoice1 = new Invoice("FV 01/01/2019");
        Invoice invoice2 = new Invoice("FV 01/02/2019");
        Invoice invoice3 = new Invoice("FV 01/03/2019");
    }
}
