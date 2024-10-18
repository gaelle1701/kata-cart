package com.gc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartLineTest {

    Product livre = new Product("livre",14.99,20,false);
    CartLine cartLine = new CartLine(livre,1);

    @Test
    void calculateSubTotalTtc() {
        assertEquals(17.99, cartLine.calculateSubTotalTtc());
    }

    @Test
    void calculateSubTotalTax() {
        assertEquals(3, cartLine.calculateSubTotalTax());
    }
}