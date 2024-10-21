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

    public void printDetailsCart() {
        for (CartLine cartLine : this.cartLines) {
            String taken = cartLine.getProduct().isImported ?"importé":"";
            System.out.printf("%d %s %s à %.2f€ HT soit %.2f€ TTC.%n",
                    cartLine.getQuantity(),
                    cartLine.getProduct().getName(),
                    taken,cartLine.getProduct().getHt(),
                    cartLine.calculateSubTotalPrice());
        }
    }

}
