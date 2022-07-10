package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product pencil = new Product("Pencil");
        Product pen = new Product("Pen");
        Item item1 = new Item(pencil, new BigDecimal(1.5),5);
        Item item2 = new Item(pen, new BigDecimal(2.2), 3);

        pencil.getItems().add(item1);
        pen.getItems().add(item2);
        item1.setProduct(pencil);
        item2.setProduct(pen);

        Invoice invoice = new Invoice("777/07/22");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
