package com.gc.lib;

public class RoundingUtil {

    public static double roundUp(double value) {
        double rounded = 0.05;
        return Math.ceil(value / rounded) * rounded;
    }
}
