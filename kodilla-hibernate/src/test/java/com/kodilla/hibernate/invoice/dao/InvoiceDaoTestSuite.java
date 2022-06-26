package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product = new Product("Chleb");
        Product product2 = new Product("Bułka");
        Item item = new Item(new BigDecimal(10), 10,  new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(20), 20,  new BigDecimal(20));
        item.setProduct(product);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("001/06/2022");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);


        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);

    }

}
