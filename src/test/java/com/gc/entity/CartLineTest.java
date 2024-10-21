package com.gc.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartLineTest {

    private CartLine cartLine1;
    private CartLine cartLine2;
    private CartLine cartLine3;

    @BeforeEach
    public void setUp() {
        Product book = new Product("livre", 12.49, 10, false);
        Product cd = new Product("cd", 14.99, 20, false);
        Product chocolateBar = new Product("barre de chocolat", 0.85, 0, false);
        cartLine1 = new CartLine(book,2);
        cartLine2 = new CartLine(cd,1);
        cartLine3 = new CartLine(chocolateBar,3);
    }

    @Test
    void calculateSubTotalTtc() {
        assertEquals(27.48, cartLine1.calculateSubTotalPrice());
        System.out.println("1- Calculate Sub Total Ttc: " + cartLine1.calculateSubTotalPrice());
        assertEquals(17.99, cartLine2.calculateSubTotalPrice());
        System.out.println("2- Calculate Sub Total Ttc: " + cartLine2.calculateSubTotalPrice());
        assertEquals(2.55, cartLine3.calculateSubTotalPrice());
        System.out.println("3- Calculate Sub Total Ttc: " + cartLine3.calculateSubTotalPrice());
    }

    @Test
    void calculateSubTotalTax() {
        assertEquals(2.5, cartLine1.calculateSubTotalTax());
        System.out.println("1- Calculate Sub Total Tax: " + cartLine1.calculateSubTotalTax());
        assertEquals(3, cartLine2.calculateSubTotalTax());
        System.out.println("2- Calculate Sub Total Tax: " + cartLine2.calculateSubTotalTax());
        assertEquals(0, cartLine3.calculateSubTotalTax());
        System.out.println("3- Calculate Sub Total Tax: " + cartLine3.calculateSubTotalTax());
    }
}