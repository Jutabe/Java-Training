package com.banaszewski;

public class Bread extends Hamburger {
    private String[] breadTypeArray = {"Wheat bread", "Ciabatta bread", "White bread", "Pumpernikiel" ,"Brown rye bread"};
    private double[] breadPriceArray = {0.30, 0.45, 0.25, 0.90 ,0.55};
    private double breadCost;

    public Bread() {

    }

    public String[] getBreadTypeArray() {
        return breadTypeArray;
    }

    public double[] getBreadPriceArray() {
        return breadPriceArray;
    }

    public double getBreadCost() {
        return breadCost;
    }

    public double getPriceFromArray(int index) {
        return breadPriceArray[index - 1];
    }

    public void setBreadCost(double breadCost) {
        this.breadCost = breadCost;
    }
}