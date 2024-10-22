package com.gc.entity;

import com.gc.Tax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Product book;
    private Product cd;
    private Product chocolateBar;
    private Cart cart;

    @BeforeEach
    public void setUp() {
        book = new Product("livre",12.49, Tax.BOOK,false);
        cd = new Product("cd",14.99,Tax.OTHER,false);
        chocolateBar = new Product("barre de chocolat",0.85,Tax.ESSENTIAL,false);

        cart = new Cart();
    }

    @DisplayName("Add product to cart")
    @Test
    public void testAddProduct() {
        System.out.println("Product added to Cart");
        cart.addProduct(book, 2);
        cart.addProduct(cd, 1);
        cart.addProduct(chocolateBar,3);

        System.out.println("Check size of list cartLines in Cart : " + cart.getCartLines().size());
        List<CartLine> cartLines = cart.getCartLines();
        assertEquals(3,cartLines.size());

        System.out.println("Check added product : " + cartLines.get(0).getProduct().getName() + " + " + cartLines.get(1).getProduct().getName());
        CartLine cartLine = cartLines.get(0);
        CartLine cartLine1 = cartLines.get(1);
        CartLine cartLine2 = cartLines.get(2);
        assertEquals(book,cartLine.getProduct());
        assertEquals(cd,cartLine1.getProduct());
        assertEquals(chocolateBar,cartLine2.getProduct());

        System.out.println("Check quantity : " + cartLine.getQuantity() + " + " + cartLine1.getQuantity());
        assertEquals(2,cartLine.getQuantity());
        assertEquals(1,cartLine1.getQuantity());
        assertEquals(3,cartLine2.getQuantity());
    }

    @DisplayName("Calculate total cart price")
    @Test
    public void testCalculateTotal() {
        cart.addProduct(book, 2);
        cart.addProduct(cd, 1);
        cart.addProduct(chocolateBar, 3);

        double totalCartPrice = cart.calculateTotalPrice();
        assertEquals(48.02,totalCartPrice);
        System.out.println("Total cart price : " + totalCartPrice);
    }

    @DisplayName("Calculate total cart taxes")
    @Test
    public void testCalculateTotalTaxes() {
        cart.addProduct(book, 2);
        cart.addProduct(cd, 1);
        cart.addProduct(chocolateBar, 3);

        double totalCartTax = cart.calculateTotalTaxes();
        assertEquals(5.5,totalCartTax);
        System.out.println("Total cart taxes : " + totalCartTax);
    }
}