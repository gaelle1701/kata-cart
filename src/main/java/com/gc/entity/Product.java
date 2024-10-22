package com.gc.entity;

import com.gc.Tax;
import com.gc.lib.FormatPrice;
import com.gc.lib.Rounding;

public class Product {
    private Tax tax;
    private String name;
    private double ht;
    boolean isImported;

    public Product(String name, double ht, Tax tax, boolean isImported) {
        this.name = name;
        this.ht = ht;
        this.tax = tax;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public double getHt() {
        return ht;
    }

    public Tax getTax() {
        return tax;
    }


    public double calculateTax() {
        // Calcul de la TVA arrondie
        double tvaTax = Rounding.roundUp((ht * tax.getTaxValue()) / 100);

        // Calcul de la taxe d'importation de 5% arrondie
        double importTax = isImported ? Rounding.roundUp((ht * 5) / 100) : 0;

        return tvaTax + importTax;
    };

    public double calculatePrice() {
        // Calcule du TTC arrondi et formater à 0.##
        return FormatPrice.formatTtc(ht + calculateTax());
    }

}
