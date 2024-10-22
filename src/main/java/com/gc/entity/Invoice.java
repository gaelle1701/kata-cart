package com.gc.entity;

import com.gc.lib.FormatPrice;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Cart> carts;
    private List<CartLine> cartLines;
    private double total = 0;
    private double tax = 0;
    private int cartNumber = 1;

    public Invoice() {
        this.carts = new ArrayList<>();
        this.cartLines = new ArrayList<>();
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }

    public double getTotal() {
        return total;
    }

    public double getTax() {
        return tax;
    }

    public int getCartNumber() {
        return cartNumber;
    }

    public void addCart(Cart cart) {
        this.carts.add(cart);
    }

    public void generateInvoice() {
        for (Cart cart : this.carts) {
            System.out.println("Panier n°: " + cartNumber);
            cart.printDetailsCart();
            cartNumber++;

            System.out.println("Total des taxes: "+cart.calculateTotalTaxes()+" €");
            System.out.println("Total: "+cart.calculateTotalPrice()+" €");
            System.out.println("_________________________________________________");
        }
    }

}
