package com.gc.entity;

import com.gc.lib.RoundingUtil;

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

    public double calculateSubTotalTtc() {
        return product.calculateTtc() * quantity;
    }

    public double calculateSubTotalTax() {
        return RoundingUtil.roundUp(product.calculateTax() * quantity);
    }
}
