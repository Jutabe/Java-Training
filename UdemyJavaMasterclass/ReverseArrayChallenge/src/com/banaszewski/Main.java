package com.banaszewski;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    /*
	        1. Write a method called reverse() with an int array as a parameter
	        2. The method should not return any value. In other words, the method is allowed to modify the array parameter.
	        3. In main() test the reverse() method and print the array both reversed and non-reversed.
	        4. To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
	        5. For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.
	        6. Tip:
	            - Create a new console project with the name 'ReverseArrayChallenge'
	     */

        System.out.println("This app creates a random array and reverts its elements.");
        System.out.println("Choose the length of your random array.");
	    System.out.print("Enter a number: ");
        int[] nonReversedArray = createRandomArray(scanner.nextInt());
        System.out.println("Non-reversed array: ");
        printArray(nonReversedArray);
        System.out.println("Reversed array: ");
        reverseArray(nonReversedArray);
        printArray(nonReversedArray);
    }
    
    private static int[] createRandomArray(int count) {
        int max = 25;
        int min = 1;
        int range = max - min + 1;
        int[] randomArray = new int[count];
        for(int i=0; i<randomArray.length; i++) {
            randomArray[i] = (int) (Math.random()*range) + min;
        }
        return randomArray;
    }

    private static void reverseArray(int[] array) {
        int swap;
        for(int i=0; i<array.length/2; i++) {
            swap = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = swap;
        }
    }
    
    private static void printArray(int[] array) {
        System.out.print("{");
        for(int i=0; i<array.length; i++) {
            if(i!=array.length-1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "}");
                System.out.println();
            }
        }
    }
}
