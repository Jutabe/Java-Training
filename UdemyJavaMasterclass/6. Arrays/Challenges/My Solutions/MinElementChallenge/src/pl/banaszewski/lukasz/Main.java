package pl.banaszewski.lukasz;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Minimum value is = " + findMin(readIntegers(5)));

    }

    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        System.out.println("Enter " + count + " integer values:\r");

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static int findMin(int[] array) {
        int minValue = array[0];

        for(int i=0; i<array.length; i++) {
            if(array[i] <= minValue) {
                 minValue = array[i];
            }

        }

        return minValue;
    }
}
