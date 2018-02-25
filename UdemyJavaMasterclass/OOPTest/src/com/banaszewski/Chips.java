package com.banaszewski;

public class Chips extends Hamburger {
    private String[] chipsTypeArray = new String[] {"Standard cut fries", "Belgian fries", "Curly fries", "British chips", "Potato wedges"};
    private double[] chipsPriceArray = new double[] {2.00, 3.00, 5.00, 3.00, 5.50};
    private String chipsType;
    private double chipsCost;

    public Chips() {

    }

    public double chooseChips(int inputSelect) throws Exception {
        String chooseChipsComposition = compose(inputSelect, chipsTypeArray, chipsPriceArray);
        if (chooseChipsComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseChipsComposition != " ") {
            setChipsType(chooseChipsComposition);
            setChipsCost(getHamburgerCost());
            return getChipsCost();
        } else return -1;
    }

    public String getChipsType() {
        return chipsType;
    }

    public double getChipsCost() {
        return chipsCost;
    }

    public String[] getChipsTypeArray() {
        return chipsTypeArray;
    }

    public void setChipsType(String chipsType) {
        this.chipsType = chipsType;
    }

    public void setChipsCost(double chipsCost) {
        this.chipsCost = chipsCost;
    }
}
