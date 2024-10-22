package com.gc.lib;

public class Rounding {

    public static double roundUp(double value) {
        double rounded = 0.05;
        return Math.ceil(value / rounded) * rounded;
    }
}
