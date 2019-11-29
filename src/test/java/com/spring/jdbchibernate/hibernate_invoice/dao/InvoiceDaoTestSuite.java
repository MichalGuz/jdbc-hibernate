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

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product1.getItems().add(item4);
        product2.getItems().add(item5);
        product3.getItems().add(item6);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice3.getItems().add(item5);
        invoice3.getItems().add(item6);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product1);
        item5.setProduct(product2);
        item6.setProduct(product3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice2);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);
        item5.setInvoice(invoice2);
        item6.setInvoice(invoice3);

        // when
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        invoiceDao.save(invoice3);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);
        itemDao.save(item6);


    }
}
