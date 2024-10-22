package com.gc;

import com.gc.entity.Cart;
import com.gc.entity.Invoice;
import com.gc.entity.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product book = new Product("livre",12.49,Tax.BOOK,false);
        Product cd = new Product("cd",14.99,Tax.OTHER,false);
        Product chocolateBar = new Product("barre de chocolat",0.85,Tax.ESSENTIAL,false);
        Product chocolateBox = new Product("boîte de chocolats",10,Tax.ESSENTIAL,true);
        Product perfume = new Product("parfum",47.50,Tax.OTHER,true);
        Product perfume1 = new Product("parfum",27.99,Tax.OTHER,true);
        Product perfume2 = new Product("parfum",18.99,Tax.OTHER,false);
        Product pills = new Product("pilules contre la migraine",9.75,Tax.ESSENTIAL,false);
        Product chocolateBox1 = new Product("boîte de chocolats",11.25,Tax.ESSENTIAL,true);

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();

        cart1.addProduct(book, 2);
        cart1.addProduct(cd, 1);
        cart1.addProduct(chocolateBar, 3);
        cart2.addProduct(chocolateBox, 2);
        cart2.addProduct(perfume, 3);
        cart3.addProduct(perfume1, 2);
        cart3.addProduct(perfume2, 1);
        cart3.addProduct(pills, 3);
        cart3.addProduct(chocolateBox1, 2);

        Invoice invoice = new Invoice();
        invoice.addCart(cart1);
        invoice.addCart(cart2);
        invoice.addCart(cart3);

        invoice.generateInvoice();


    }
}