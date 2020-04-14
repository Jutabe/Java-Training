package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        /** Challenge!
         Create a method called calcFeetAndInchesToCentimeters
         It needs to have two parameters.
         feet is the first parameter, inches is the second parameter.

         You should validate that the first parameter feet is >=0
         You should validate that the 2nd parameter inches is >=0 and <=12
         return -1 from the method if either of the above is not true.

         If the parameters are valid, then calculate how many centimeters
         comprise the feet and inches passed to this method and return
         that value.

         Create a 2nd method of the same name but with only one parameter
         inches is the parameter
         validate that its >=0
         return -1 if it is not true
         But if its valid, then calculate how many feet are in the inches
         and then here is the tricky part
         call the other overloaded method passing correct feet and inches
         calculated so that it can calculate correctly.
         hints: Use double for your umber datatypes is probably a good idea
         1 inch = 2.54cm and one foot = 12 inches
         use the link I give you to confirm your code is calculating correctly.
         Calling another overloaded method just requires you to use the
         right number of parameters.
         **/
        calcFeetAndInchesToCentimeters(25);
        calcFeetAndInchesToCentimeters(34.25);
        calcFeetAndInchesToCentimeters(10, 10);
        calcFeetAndInchesToCentimeters(3.5, 4.5);
        calcFeetAndInchesToCentimeters(2.5, 4);
        calcFeetAndInchesToCentimeters(5, 4.4);
        calcFeetAndInchesToCentimeters(10, 13);
        calcFeetAndInchesToCentimeters(7,5);
    }


    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = inches * 0.083333;
            double resultInches = calcFeetAndInchesToCentimeters(feet, 0);
            return resultInches;
        } else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double centimeters = 12 * feet * 2.54 + inches * 2.54;
            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters.");
            return centimeters;
        } else return -1;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
