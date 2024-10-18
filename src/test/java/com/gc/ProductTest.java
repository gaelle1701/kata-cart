package com.gc;

import com.gc.entity.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product livre = new Product("livre",12.49,10,false);

    @Test
    void calculateTax() {
        assertEquals(1.25, livre.calculateTax());
    }

    @Test
    void calculateTtc() {
        assertEquals(13.74, livre.calculateTtc());
    }
}