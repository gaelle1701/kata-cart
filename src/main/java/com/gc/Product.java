package com.gc;

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


    public double calculateTtc() {

        // Calcul de la taxe d'importation de 5% arrondie
        double ti = isImported ? RoundingUtil.roundUp(ht * 5/100) : 0;

        // Calcule de la TVA arrondie
        return (ht + RoundingUtil.roundUp(ht * tva/100) + ti);
    }
}
