package com.gc.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    private Product book;
    private Product cd;
    private Product chocolateBar;
    private Product chocolateBox;
    private Product parfum;
    private Cart cart1;
    private Cart cart2;

    @BeforeEach
    public void setUp() {
        book = new Product("livre",12.49,10,false);
        cd = new Product("cd",14.99,20,false);
        chocolateBar = new Product("barre de chocolat",0.85,0,false);
        cart1 = new Cart();

        chocolateBox = new Product("chocolate box",10,0,true);
        parfum = new Product("parfum",47.50,20,true);
        cart2 = new Cart();
    }

    @Test
    public void testAddCart() {
        System.out.println("Product added to Cart1");
        cart1.addProduct(book, 2);
        cart1.addProduct(cd, 1);
        cart1.addProduct(chocolateBar, 3);

        System.out.println("Product added to Cart2");
        cart2.addProduct(chocolateBox, 2);
        cart2.addProduct(parfum, 3);
    }

    @Test
    void testCalculateTotal() {
        System.out.println("Product added to Cart1");
        cart1.addProduct(book, 2);
        cart1.addProduct(cd, 1);
        cart1.addProduct(chocolateBar, 3);

        System.out.println("Product added to Cart2");
        cart2.addProduct(chocolateBox, 2);
        cart2.addProduct(parfum, 3);

        double totalCart1Price = cart1.calculateTotalPrice();
        assertEquals(48.02,totalCart1Price);
        System.out.println("Total cart price : " + totalCart1Price);

        double totalCart2Price = cart2.calculateTotalPrice();
        assertEquals(199.20,totalCart2Price);
        System.out.println("Total cart price : " + totalCart2Price);
    }

    @Test
    public void testCalculateTax() {
        System.out.println("Product added to Cart1");
        cart1.addProduct(book, 2);
        cart1.addProduct(cd, 1);
        cart1.addProduct(chocolateBar, 3);

        System.out.println("Product added to Cart2");
        cart2.addProduct(chocolateBox, 2);
        cart2.addProduct(parfum, 3);

        double totalCart1Taxes = cart1.calculateTotalTaxes();
        assertEquals(5.50,totalCart1Taxes);
        System.out.println("Total taxes : " + totalCart1Taxes);

        double totalCart2Taxes = cart2.calculateTotalTaxes();
        assertEquals(36.70,totalCart2Taxes);
        System.out.println("Total taxes : " + totalCart2Taxes);
    }
}