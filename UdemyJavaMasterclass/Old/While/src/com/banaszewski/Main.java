package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        // While and for loop may never run
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // Do-While loop runs at least once
        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        /** Challenge #1:
         * Create a method called isEvenNumber that takes a parameter of type int
         * Its purpose is to determine if the argument passed to the method is
         * an even number or not.
         * return true if an even number, otherwise return false.
         */
        System.out.println("\n***Challenge #1***\n");

        int number = 5;
        int finishNumber = 20;
        while (number < finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }

        /** Challenge #2:
         * Modify the while code above
         * Make it also record the total number of even numbers it has found
         * and break once 5 are found
         * and at the end, display the total number of even numbers found.
         */

        System.out.println("\n***Challenge #2***\n");
        number = 5;
        finishNumber = 20;
        count = 1;
        while (number < finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            if(count == 5) {
                System.out.println("I have found " + count + " even numbers.");
                break;
            }
            count++;
            number++;

        }
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
