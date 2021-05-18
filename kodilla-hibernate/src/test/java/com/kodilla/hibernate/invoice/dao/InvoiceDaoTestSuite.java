package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NUMBER = "01-01-2021-invoice_example_number";

    @Rollback(false)
    @Test
    void testInvoiceDaoSave() {
        // given
        Product product1 = new Product("Bread");
        Product product2 = new Product("Butter");
        Item item1 = new Item(new BigDecimal("3.05"), 30);
        Item item2 = new Item(new BigDecimal("5.05"), 8);
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice = new Invoice(NUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        // when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // then
        assertNotEquals(0, id);

        // cleanup
        //invoiceDao.deleteById(id);
    }
}
