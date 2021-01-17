package pl.banaszewski.lukasz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] originalArray = createArray(readInteger());
        System.out.println("Original array is: " + Arrays.toString(originalArray));

        reverse(originalArray);
        System.out.println("Original array was reversed and is now: " + Arrays.toString(originalArray));
    }

    private static int readInteger() {
        System.out.println("Enter the number of elements for new array:\r");
        int integer = scanner.nextInt();
        scanner.nextLine();

        return integer;
    }

    private static int[] createArray(int elementCount) {
        int[] array = new int[elementCount];
        System.out.println("Type " + elementCount + " values for your array:\r");

        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    private static void reverse(int[] array) {
        int[] tempArray = Arrays.copyOf(array, array.length);

        for(int i=0; i<array.length; i++) {
            array[i] = tempArray[array.length - i - 1];
        }
    }
}
