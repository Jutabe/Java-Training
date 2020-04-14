package com.banaszewski;

import java.util.Arrays;

public class Deluxe extends Hamburger {
    String[] deluxeArray = new String[]{"Cheese", "Lettuce", "Bacon", "Onion", "Mustard"};
    double costFixer = 0;

    public Deluxe() {
        super("Deluxe burger", 5, "Beef", "Ciabatta bread");
    }

    @Override
    public double chooseMeat(int inputSelect, Meat theMeat) throws Exception {
        inputSelect = (Arrays.asList(theMeat.getMeatTypeArray()).lastIndexOf("Beef")) + 1;
        String chooseMeatComposition = compose(inputSelect, theMeat.getMeatTypeArray(), theMeat.getMeatPriceArray());
        if (chooseMeatComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseMeatComposition == "Beef") {
            setMeatType("Beef");
            theMeat.setMeatCost((theMeat.getPriceFromArray(inputSelect)));
            return theMeat.getMeatCost();
        } else return -1;
    }

    @Override
    public double chooseBread(int inputSelect, Bread theBread) throws Exception {
        inputSelect = (Arrays.asList(theBread.getBreadTypeArray()).lastIndexOf("Ciabatta bread")) + 1;
        String chooseBreadComposition = compose(inputSelect, theBread.getBreadTypeArray(), theBread.getBreadPriceArray());
        if (chooseBreadComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseBreadComposition == "Ciabatta bread") {
            setBreadType("Ciabatta bread");
            theBread.setBreadCost(theBread.getPriceFromArray(inputSelect));
            return theBread.getBreadCost();
        } else return -1;
    }

    @Override
    public double chooseAdditions(int inputSelect, Additions theAdditions) throws Exception {
        String chooseAdditionsComposition = compose(inputSelect, theAdditions.getAdditionsTypeArray(), theAdditions.getAdditionsPriceArray());
        if (chooseAdditionsComposition == "WrongMenuSelection") {
            return 0;
        } else if (chooseAdditionsComposition != " ") {
            for (String deluxeAddition : deluxeArray) {
                inputSelect = (Arrays.asList(theAdditions.getAdditionsTypeArray()).lastIndexOf(deluxeAddition)) + 1;
                chooseAdditionsComposition = compose(inputSelect, theAdditions.getAdditionsTypeArray(), theAdditions.getAdditionsPriceArray());
                System.out.println(getName() + " comes by default with " + chooseAdditionsComposition + "!");
                additionsType.add(chooseAdditionsComposition);
                additionsCost.add(String.valueOf(getArrayPriceByIndex(inputSelect, theAdditions.getAdditionsPriceArray())));
                costFixer += getArrayPriceByIndex(inputSelect, theAdditions.getAdditionsPriceArray());
                setHamburgerCost(costFixer);
            }
            return getHamburgerCost();
        } else return -1;
    }
}
