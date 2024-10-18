package com.gc;

import com.gc.entity.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product livre = new Product("livre",12.49,10,false);

        System.out.println(livre.getHt());
        System.out.println(livre.calculateTtc());
    }
}