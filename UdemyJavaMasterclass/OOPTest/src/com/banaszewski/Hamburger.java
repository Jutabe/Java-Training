package com.banaszewski;

import java.util.ArrayList;

public class Hamburger {
    private String name;
    private int additionsNumber;
    private String meatType;
    private String breadType;
    private double hamburgerCost;
    protected ArrayList<String> additionsType = new ArrayList<>();
    protected ArrayList<String> additionsCost = new ArrayList<>();

    public Hamburger() {
        this.name = "Classical burger";
        this.additionsNumber = 4;
    }

    public Hamburger(String name, int additionsNumber) {
        this.name = name;
        this.additionsNumber = additionsNumber;
    }

    public Hamburger(String name, int additionsNumber, String meatType, String breadType) {
        this.name = name;
        this.additionsNumber = additionsNumber;
        this.meatType = meatType;
        this.breadType = breadType;
    }

    public String compose(int inputSelect, String[] valueArray, double[] priceArray) throws Exception {

        String arrayValueByIndex = getArrayValueByIndex(inputSelect, valueArray);
        if((arrayValueByIndex != "BadInput") && (arrayValueByIndex != "LastMenuIndex")) {
            setHamburgerCost(getArrayPriceByIndex(inputSelect, priceArray));
            return arrayValueByIndex;
        } else if (arrayValueByIndex == "LastMenuIndex") {
            return " ";
        } else {
            System.out.println("Wrong number selected. Try picking a proper one.");
            return "WrongMenuSelection";
        }
    }

    public double chooseMeat(int inputSelect, Meat theMeat) throws Exception {
        String chooseMeatComposition = compose(inputSelect, theMeat.getMeatTypeArray(), theMeat.getMeatPriceArray());
        if (chooseMeatComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseMeatComposition != " ") {
            setMeatType(chooseMeatComposition);
            theMeat.setMeatCost(getHamburgerCost());
            return theMeat.getMeatCost();
        } else return -1;
    }

    public double chooseBread(int inputSelect, Bread theBread) throws Exception {
        String chooseBreadComposition = compose(inputSelect, theBread.getBreadTypeArray(), theBread.getBreadPriceArray());
        if (chooseBreadComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseBreadComposition != " ") {
            setBreadType(chooseBreadComposition);
            theBread.setBreadCost(getHamburgerCost());
            return theBread.getBreadCost();
        } else return -1;
    }

    public double chooseAdditions(int inputSelect, Additions theAdditions) throws Exception {
        String chooseAdditionsComposition = compose(inputSelect, theAdditions.getAdditionsTypeArray(), theAdditions.getAdditionsPriceArray());
        if (chooseAdditionsComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseAdditionsComposition != " ") {
            additionsType.add(chooseAdditionsComposition);
            additionsCost.add(String.valueOf(getHamburgerCost()));
            return getHamburgerCost();
        } else return -1;
    }


    public String getArrayValueByIndex(int arrayIndex, String[] array) {
        if ((arrayIndex < (array.length + 1) && (arrayIndex > 0))) {
            return array[arrayIndex - 1];
        } else if (arrayIndex == array.length + 1) {
            return "LastMenuIndex";
        } else return "BadInput";
    }

    public double getArrayPriceByIndex(int arrayIndex, double[] array) {
        if ((arrayIndex < (array.length + 1) && (arrayIndex > 0))) {
            return array[arrayIndex - 1];
        } else return 0;
    }

    public String getName() {
        return name;
    }

    public int getAdditionsNumber() {
        return additionsNumber;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getHamburgerCost() {
        return hamburgerCost;
    }

    public ArrayList<String> getAdditionsType() {
        return additionsType;
    }

    public ArrayList<String> getAdditionsCost() {
        return additionsCost;
    }

    public void setAdditionsNumber(int additionsNumber) {
        this.additionsNumber = additionsNumber;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }


    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setHamburgerCost(double hamburgerCost) {
        this.hamburgerCost = hamburgerCost;
    }

    public void setAdditionsType(ArrayList<String> additionsType) {
        this.additionsType = additionsType;
    }

    public void setAdditionsCost(ArrayList<String> additionsCost) {
        this.additionsCost = additionsCost;
    }
}
