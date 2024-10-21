package com.gc.entity;

import com.gc.lib.FormatPrice;
import com.gc.lib.Rounding;

public class CartLine {
    private Product product;
    private int quantity;

    public CartLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateSubTotalPrice() {
        return product.calculatePrice() * quantity;
    }

    public double calculateSubTotalTax() {
        return Rounding.roundUp(product.calculateTax() * quantity);
    }
}
