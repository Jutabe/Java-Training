package com.banaszewski;

public class Meat extends Hamburger {
    private String[] meatTypeArray = {"Grilled chicken", "Beef", "Fish fillet", "Pulled pork"};
    private double[] meatPriceArray = {1.30, 2.60, 1.80, 1.50};
    private double meatCost;

    public String[] getMeatTypeArray() {
        return meatTypeArray;
    }

    public double[] getMeatPriceArray() {
        return meatPriceArray;
    }

    public double getMeatCost() {
        return meatCost;
    }

    public double getPriceFromArray(int index) {
        return meatPriceArray[index - 1];
    }

    public void setMeatCost(double meatCost) {
        this.meatCost = meatCost;
    }
}
