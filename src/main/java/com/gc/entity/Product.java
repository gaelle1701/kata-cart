package com.gc.entity;

import com.gc.lib.FormatPrice;
import com.gc.lib.Rounding;

public class Product {
    private String name;
    private double ht;
    private double tva;
    boolean isImported;

    public Product(String name, double ht, double tva, boolean isImported) {
        this.name = name;
        this.ht = ht;
        this.tva = tva;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHt() {
        return ht;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double calculateTax() {
        // Calcul de la TVA arrondie
        double tvaTax = Rounding.roundUp((ht * tva) / 100);

        // Calcul de la taxe d'importation de 5% arrondie
        double importTax = isImported ? Rounding.roundUp((ht * 5) / 100) : 0;

        return tvaTax + importTax;
    };

    public double calculatePrice() {
        // Calcule du TTC arrondi et formater à 0.##
        return FormatPrice.formatTtc(ht + calculateTax());
    }

}
