package com.banaszewski;

public class Drink extends Hamburger {
    private String[] drinkTypeArray = new String[] {"Coca-cola", "Pepsi", "Fanta", "Sprite", "Beer", "Water"};
    private double[] drinkPriceArray = new double[] {0.30, 0.30, 0.35, 0.40, 0.60, 0.20};
    private String drinkType;
    private double drinkCost;

    public Drink() {

    }

    public double chooseDrink(int inputSelect) throws Exception {
        String chooseDrinkComposition = compose(inputSelect, drinkTypeArray, drinkPriceArray);
        if (chooseDrinkComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseDrinkComposition != " ") {
            setDrinkType(chooseDrinkComposition);
            setDrinkCost(getHamburgerCost());
            return getDrinkCost();
        } else return -1;
    }

    public String[] getDrinkTypeArray() {
        return drinkTypeArray;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public double getDrinkCost() {
        return drinkCost;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public void setDrinkCost(double drinkCost) {
        this.drinkCost = drinkCost;
    }
}
