package com.gc;

import com.gc.entity.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product book = new Product("livre",12.49,10,false);
        Product cd = new Product("cd",14.99,20,false);
        Product chocolateBar = new Product("barre de chocolat",0.85,0,false);

        System.out.println(book.getHt());
        System.out.println(book.calculatePrice());
    }
}