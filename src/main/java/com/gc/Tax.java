package com.gc;

public enum Tax {
    ESSENTIAL(0), BOOK(10), OTHER(20);

    private final int taxValue;

    Tax(int taxValue) {
        this.taxValue = taxValue;
    }
    public int getTaxValue() {
        return taxValue;
    }
}
