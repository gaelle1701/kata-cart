package com.gc.lib;

public class FormatPrice {

    public static double formatTtc(double price) {
        return Math.round(price * 100.0) / 100.0;
    }
}
