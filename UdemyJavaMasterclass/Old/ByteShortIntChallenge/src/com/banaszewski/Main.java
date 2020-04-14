package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid int number.
        // 4. Create a variable of type long, and make it equal t
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteVariable = 10;
        short shortVariable = 20;
        int intVariable = 50;
        long longTotal = 50000 + 10 * (byteVariable + shortVariable + intVariable);
        short shortTotal = (short) (1000 + 10 * (byteVariable + shortVariable + intVariable));

        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
