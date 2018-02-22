package com.banaszewski;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        double totalPrice = 0;
        int keyboardInput;
        boolean stayInMenu = true;
        List<String> billTypesArray = new ArrayList<>();
        List<String> billPriceArray = new ArrayList<>();

        for (; ; ) {
            Meat theMeat = new Meat();
            Bread theBread = new Bread();
            Additions theAdditions = new Additions();

            initialScreen();
            System.out.println("\nYour current bill is " + String.format("%.2f", totalPrice) + " $");

            subMenu: {
                switch (inputSelect()) {
                    case 1:
                        //Classical Burger chosen:
                        Hamburger theHamburger = new Hamburger("Classical burger", 4);
                        String subMenuTemp;
                        double hamburgerCost = 0;

                        clearScreen();

                        //Going to the Meat selection screen:
                        System.out.println("\nSelect meat type for your " + theHamburger.getName() + ":");
                        createMenu(theMeat.getMeatTypeArray());
                        while(stayInMenu) {
                            keyboardInput = inputSelect();
                            if (theHamburger.chooseMeat(keyboardInput, theMeat) == 0) {
                                stayInMenu = true;
                            } else if (theHamburger.chooseMeat(keyboardInput, theMeat) > 0) {
                                hamburgerCost += theHamburger.chooseMeat(keyboardInput, theMeat);
                                clearScreen();
                                stayInMenu = false;
                            } else break subMenu;
                        }

                        //Going to the Bread selection screen:
                        stayInMenu = true;
                        System.out.println("\nSelect bread type for your " + theHamburger.getName() + ":");
                        createMenu(theBread.getBreadTypeArray());
                        while(stayInMenu){
                            keyboardInput = inputSelect();
                            if (theHamburger.chooseMeat(keyboardInput, theMeat) == 0) {
                                stayInMenu = true;
                            } else if(theHamburger.chooseBread(keyboardInput, theBread) > 0) {
                                hamburgerCost += theHamburger.chooseBread(keyboardInput, theBread);
                                clearScreen();
                                stayInMenu = false;
                            } else break subMenu;
                        }

                        //Going to the Additions selection screen:
                        for(int i = 0; i <= theHamburger.getAdditionsNumber() - 1; i++) {
                            stayInMenu = true;
                            System.out.println("\nSelect addition(s) for your " + theHamburger.getName() + " [" + (theHamburger.getAdditionsNumber() - i) + " more addition(s)]:");
                            createMenu(theAdditions.getAdditionsTypeArray());
                            while(stayInMenu) {
                                keyboardInput = inputSelect();
                                if (theHamburger.chooseMeat(keyboardInput, theMeat) == 0) {
                                    stayInMenu = true;
                                } else if (theHamburger.chooseAdditions(keyboardInput, theAdditions) > 0) {
                                    hamburgerCost += theHamburger.chooseAdditions(keyboardInput, theAdditions);
                                    clearScreen();
                                    stayInMenu = false;
                                } else break subMenu;
                            }
                        }

                        billTypesArray.add(theHamburger.getName());
                        billPriceArray.add(" ");
                        billTypesArray.add(theHamburger.getMeatType());
                        billPriceArray.add(String.valueOf(theMeat.getMeatCost()));
                        billTypesArray.add(theHamburger.getBreadType());
                        billPriceArray.add(String.valueOf(theBread.getBreadCost()));

                        for(int i=0; i<=theHamburger.getAdditionsNumber() - 1; i++) {
                            billTypesArray.add(theHamburger.getAdditionsType().get(i));
                            billPriceArray.add(theHamburger.getAdditionsCost().get(i));
                        }
                        totalPrice += hamburgerCost;
                        break;
                    case 2:
                        System.out.println("2 selected");
                        break;
                    case 3:
                        System.out.println("3 selected");
                        break;
                    case 4:
                        System.out.println("4 selected");
                        break;
                    case 5:
                        System.out.println("5 selected");
                        break;
                    case 6:
                        int j = 1;
                        System.out.println("Printing order bill...");
                        for(int i = 0; i <= billPriceArray.size() - 1; i++) {
                            if(billPriceArray.get(i) == " ") {
                                System.out.println("\nOrder #" + j + ": " + billTypesArray.get(i));
                                j++;
                            } else {
                                System.out.format("%-20s= %s", billTypesArray.get(i), billPriceArray.get(i));
                                System.out.println("$");
                            }
                        }
                        System.out.format("%-21s= %s", "\nTotal price: ", String.format("%.2f", totalPrice));
                        System.out.println("$");
                        System.exit(0);
                        break;
                    default:
                        System.out.print("Wrong number. Select the proper one: ");
                }
            }
        }
    }

    public static int inputSelect() throws Exception {
        char select, ignore;
        System.out.print("\nSelect a number: ");
        select = (char) System.in.read();
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        return Character.getNumericValue(select);
    }

    public static void initialScreen() throws Exception {
        System.out.println("\nPlace your order by choosing the right option:");
        System.out.println("\n1. Classic hamburger:");
        System.out.println("\tmeat and bread roll type with up to 4 additions all of your choosing,");
        System.out.println("2. Healthy burger:");
        System.out.println("\tvegetarian burger on a brown rye bread roll with up to 6 additions of your choosing,");
        System.out.println("3. Deluxe hamburger:");
        System.out.println("\tbeef meat on a ciabatta  bread roll with cheese, lettuce, bacon, onion and mustard,");
        System.out.println("\tcomes with chips and drink of your choosing:");
        System.out.println("4. Extra chips.");
        System.out.println("5. Extra drink.");
        System.out.println("6. End order and print the bill.");
    }

    public static void createMenu(String[] array) {
        for(int i = 1; i < (array.length) + 1; i++){
            System.out.println(i + ". " + array[i-1] + ", ");
            int tmp = i + 1;
            if(tmp == (array.length + 1))
                System.out.println(tmp + ". Go to main menu (current selection will be terminated).");
        }
    }

    public static void clearScreen() throws Exception, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
