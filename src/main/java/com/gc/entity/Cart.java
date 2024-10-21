package com.gc.entity;

import com.gc.lib.FormatPrice;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartLine> cartLines;
    private double totalCartPrice = 0;
    private double totalCartTax = 0;

    public Cart() {
        this.cartLines = new ArrayList<>();
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }

    public void setCartLines(List<CartLine> cartLines) {
        this.cartLines = cartLines;
    }

    public void addProduct(Product product, int quantity) {
        this.cartLines.add(new CartLine(product, quantity));

    }

    public double calculateTotalPrice() {
        for (CartLine cartLine : this.cartLines) {
            totalCartPrice += cartLine.calculateSubTotalPrice();
        }
        return FormatPrice.formatTtc(totalCartPrice);
    }

    public double calculateTotalTaxes() {
        for (CartLine cartLine : this.cartLines) {
            totalCartTax += cartLine.calculateSubTotalTax();
        }
        return totalCartTax;
    }

}
