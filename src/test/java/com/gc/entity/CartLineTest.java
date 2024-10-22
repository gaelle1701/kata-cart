package com.gc.entity;

import com.gc.Tax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartLineTest {

    private CartLine cartLine1;
    private CartLine cartLine2;

    @BeforeEach
    public void setUp() {
        Product book = new Product("livre", 12.49, Tax.BOOK, false);
        Product cd = new Product("cd", 14.99, Tax.OTHER, false);
        cartLine1 = new CartLine(book,2);
        cartLine2 = new CartLine(cd,1);
    }

    @Test
    void calculateSubTotalTtc() {
        assertEquals(27.48, cartLine1.calculateSubTotalPrice());
        System.out.println("1- Calculate Sub Total Ttc: " + cartLine1.calculateSubTotalPrice());
        assertEquals(17.99, cartLine2.calculateSubTotalPrice());
        System.out.println("2- Calculate Sub Total Ttc: " + cartLine2.calculateSubTotalPrice());
    }

    @Test
    void calculateSubTotalTax() {
        assertEquals(2.5, cartLine1.calculateSubTotalTax());
        System.out.println("1- Calculate Sub Total Tax: " + cartLine1.calculateSubTotalTax());
        assertEquals(3, cartLine2.calculateSubTotalTax());
        System.out.println("2- Calculate Sub Total Tax: " + cartLine2.calculateSubTotalTax());
    }
}