package com.gc.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartLineTest {

    private CartLine cartLine1;
    private CartLine cartLine2;
    private CartLine cartLine3;
    private CartLine cartLine4;

    @BeforeEach
    public void setUp() {
        Product book = new Product("livre", 12.49, 10, false);
        Product cd = new Product("cd", 14.99, 20, false);
        Product chocolateBar = new Product("barre de chocolat", 0.85, 0, false);
        Product chocolateBox = new Product("boîte de chocolats", 10, 0, true);
        cartLine1 = new CartLine(book,2);
        cartLine2 = new CartLine(cd,1);
        cartLine3 = new CartLine(chocolateBar,3);
        cartLine4 = new CartLine(chocolateBox,2);
    }

    @Test
    void calculateSubTotalTtc() {
//        assertEquals(27.48, cartLine1.calculateSubTotalPrice());
//        System.out.println("1- Calculate Sub Total Ttc: " + cartLine1.calculateSubTotalPrice());
//        assertEquals(17.99, cartLine2.calculateSubTotalPrice());
//        System.out.println("2- Calculate Sub Total Ttc: " + cartLine2.calculateSubTotalPrice());
//        assertEquals(2.55, cartLine3.calculateSubTotalPrice());
//        System.out.println("3- Calculate Sub Total Ttc: " + cartLine3.calculateSubTotalPrice());
        assertEquals(21, cartLine4.calculateSubTotalPrice());
        System.out.println("4- Calculate Sub Total Ttc: " + cartLine4.calculateSubTotalPrice());
    }

    @Test
    void calculateSubTotalTax() {
//        assertEquals(2.5, cartLine1.calculateSubTotalTax());
//        System.out.println("1- Calculate Sub Total Tax: " + cartLine1.calculateSubTotalTax());
//        assertEquals(3, cartLine2.calculateSubTotalTax());
//        System.out.println("2- Calculate Sub Total Tax: " + cartLine2.calculateSubTotalTax());
//        assertEquals(0, cartLine3.calculateSubTotalTax());
//        System.out.println("3- Calculate Sub Total Tax: " + cartLine3.calculateSubTotalTax());
        assertEquals(1, cartLine4.calculateSubTotalTax());
        System.out.println("4- Calculate Sub Total Tax: " + cartLine4.calculateSubTotalTax());
    }
}