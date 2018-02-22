package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
        }
        /**
         * Create a new switch statement using char instead of int
         * create a new char variable
         * create a switch statement testing for
         * A, B, C, D, or E
         * display a message if any of these are found and then break
         * Add a default which displays a message saying "not found"
         */

        char switchChar = 'C';

        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("It is an " + switchChar);
                break;
            default:
                System.out.println("Not Found");
        }

        String month = "JaNUAry";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}
