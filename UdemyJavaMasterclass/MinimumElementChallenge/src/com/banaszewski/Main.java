package com.banaszewski;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	/*
	    1. Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
	    2. The method needs to read from the console until all the number are entered, and then return an array containing the numbers entered.
	    3. Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
	    4. In the main() method read the count from the console and call the method readIntegers() with the count parameter.
	    5. Then call the findMin() method passing the array returned from the call to the readIntegers() method.
	    6. Finnaly, print the minimum element in the array.
	    7. Tips:
	        - Assume that the user will only enter numbers, never letters,
	        - For simplicity, create a Scanner as a static field to help with data input
	        - Create a new console project with the name 'MinElementChallenge'
	 */
        double[] yourArray;
        System.out.println("This application finds the minimum element in a given array.\n");
        System.out.println("How many elements would you like to have in your array? [enter a number]");
        yourArray = readIntegers(scanner.nextInt());
        System.out.println("Finding minimum element in your array...");
        findMin(yourArray);

    }

    private static double[] readIntegers(int count) {
        double[] readIntegersArray = new double[count];
        double max = 1000;
        double min = 1;
        double range = max - min +1;
        System.out.println("You have selected '" + count + "' element array.");
        for (int i = 0; i < readIntegersArray.length; i++) {
            // Example #1: Random array elements from 0 to 1000;
            readIntegersArray[i] = Math.random()*range + min;

            /* Example #2: Select your values example:
            switch (i) {
                case 0:
                    System.out.print("Select your 1st element -> ");
                    readIntegersArray[i] = scanner.nextDouble();
                    break;
                case 1:
                    System.out.print("Select your 2nd element -> ");
                    readIntegersArray[i] = scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Select your 3rd element -> ");
                    readIntegersArray[i] = scanner.nextDouble();
                    break;
                default:
                    System.out.print("Select your " + (i+1) + "th element -> ");
                    readIntegersArray[i] = scanner.nextDouble();
                    break;
            }
            */
        }
        System.out.println();
        System.out.print("Your array values are: {");
        for(int i=0; i<readIntegersArray.length; i++) {
            if(i!=readIntegersArray.length-1) {
                System.out.print(String.format("%.2f", readIntegersArray[i]) + ", ");
            } else {
                System.out.print(String.format("%.2f", readIntegersArray[i]));
            }
        }
        System.out.print("}");
        System.out.println();
        return readIntegersArray;
    }

    private static void findMin(double[] doubleArray) {
        double isMin = doubleArray[0];
        for(int i=1; i<doubleArray.length; i++) {
            if(isMin>doubleArray[i]) {
                isMin = doubleArray[i];
            }
        }
        System.out.println("Your minimum element is -> " + String.format("%.2f", isMin));
    }
}
