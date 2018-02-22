package com.banaszewski;

public class Additions extends Hamburger {
    private String[] additionsTypeArray = {"Cheese", "Lettuce", "Tomato", "Cucumber", "Onion", "Bacon", "Ketchup", "Mustard"};
    private double[] additionsPriceArray = {0.60, 0.15, 0.35, 0.25, 0.10, 0.90, 0.30, 0.40};

    public Additions() {

    }

    public String[] getAdditionsTypeArray() {
        return additionsTypeArray;
    }

    public double[] getAdditionsPriceArray() {
        return additionsPriceArray;
    }
}
