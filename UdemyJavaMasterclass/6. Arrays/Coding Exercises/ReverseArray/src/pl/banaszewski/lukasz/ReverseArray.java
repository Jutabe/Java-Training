package pl.banaszewski.lukasz;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int[] tempArray = Arrays.copyOf(array, array.length);

        for(int i=0; i<array.length; i++) {
            array[i] = tempArray[array.length - i - 1];
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
