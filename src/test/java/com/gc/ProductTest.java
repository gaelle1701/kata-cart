package com.gc;

import com.gc.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product book;

    @BeforeEach
    public void setUp() {
        book = new Product("livre",12.49,10,false);
    }

    @Test
    void calculateTax() {
        assertEquals(1.25, book.calculateTax());
        System.out.println("Tax livre = " + book.calculateTax());
    }

    @Test
    void calculateTtc() {
        assertEquals(13.74, book.calculatePrice());
        System.out.println("Price livre = " + book.calculatePrice());
    }
}