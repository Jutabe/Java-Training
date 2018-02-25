package com.banaszewski;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        //My solution:
        System.out.println("\nSolution #1: My solution");
        int[] myEmptyIntArray = new int[10];
        int[] myUnsortedIntArray;
        int[] mySortedArray;

        System.out.println("\nMy initial array values are: ");
        printArray(myEmptyIntArray);

        getIntegers(myEmptyIntArray);
        myUnsortedIntArray = myEmptyIntArray;
        System.out.println("\nMy unsorted array values are: ");

        printArray(myUnsortedIntArray);
        mySortedArray = sortIntegers(myUnsortedIntArray);

        System.out.println("\nMy sorted array values are: ");
        printArray(mySortedArray);

        //Tim solution:
        System.out.println("*********************************");
        System.out.println("\nSolution #2: Tims solution");
        int[] timsArray = timsGetIntegers(5);
        int[] sorted = timsSortIntegers(timsArray);
        timsPrintArray(sorted);


    }

    //My solution methods:
    public static int[] getIntegers(int[] array) {
        System.out.println("\nSelect " + array.length + " elements for your array: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
        int swapArrayValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++)
                if (array[i] < array[j]) {
                    swapArrayValue = array[i];
                    array[i] = array[j];
                    array[j] = swapArrayValue;
                }
        }
        return array;
    }

    //Tim solution methods:
    public static int[] timsGetIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void timsPrintArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] timsSortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1] ) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
