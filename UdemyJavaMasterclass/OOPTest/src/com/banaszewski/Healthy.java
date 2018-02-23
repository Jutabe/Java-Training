package com.banaszewski;

import java.util.Arrays;

public class Healthy extends Hamburger{
    public Healthy() {
        super("Healthy burger", 6, "No meat!", "Brown rye bread");
    }

    @Override
    public double chooseMeat(int inputSelect, Meat theMeat) throws Exception {
        String chooseMeatComposition = compose(inputSelect, theMeat.getMeatTypeArray(), theMeat.getMeatPriceArray());
        if (chooseMeatComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseMeatComposition == "No meat!") {
            setMeatType("No meat!");
            theMeat.setMeatCost(0);
            return theMeat.getMeatCost();
        } else return -1;
    }

    @Override
    public double chooseBread(int inputSelect, Bread theBread) throws Exception {
        inputSelect = (Arrays.asList(theBread.getBreadTypeArray()).lastIndexOf("Brown rye bread")) + 1;
        String chooseBreadComposition = compose(inputSelect, theBread.getBreadTypeArray(), theBread.getBreadPriceArray());
        if (chooseBreadComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseBreadComposition == "Brown rye bread") {
            setBreadType("Brown rye bread");
            theBread.setBreadCost(theBread.getPriceFromArray(inputSelect));
            return theBread.getBreadCost();
        } else return -1;
    }
}
