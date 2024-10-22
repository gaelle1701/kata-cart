package com.gc.entity;

import com.gc.Tax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product book;
    private Product chocolateBox;

    @BeforeEach
    public void setUp() {
        book = new Product("livre",12.49, Tax.BOOK,false);
        chocolateBox = new Product("chocolate box",10,Tax.ESSENTIAL,true);
    }


    @Test
    void calculateTax() {
        assertEquals(1.25, book.calculateTax());
        System.out.println("Tax livre = " + book.calculateTax());
        assertEquals(0.5, chocolateBox.calculateTax());
        System.out.println("Tax boîte choco = " + chocolateBox.calculateTax());
    }

    @Test
    void calculateTtc() {
        assertEquals(13.74, book.calculatePrice());
        System.out.println("Price livre = " + book.calculatePrice());
        assertEquals(10.5, chocolateBox.calculatePrice());
        System.out.println("Price boîte choco = " + chocolateBox.calculatePrice());
    }
}