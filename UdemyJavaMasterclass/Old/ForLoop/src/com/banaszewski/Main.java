package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n***Challenge #1***\n");
        /** Challenge #1:
         * using the for statement, call the calculateInterest method with
         * the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
         * and print the results to the console window.
         */

        for (double i = 2; i <= 8; i += 0.25) {
            System.out.println("2345 PLN at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(2345, i))
                    + " PLN.");
        }
        System.out.println("\n***Challenge #2***\n");
        /** Challenge #2:
         * How would you modify the for loop above to do the same thing as
         * shown but to start from 8% and work back to 2%?
         */
        for (double i = 8; i >= 2; i -= 0.25) {
            System.out.println("2345 PLN at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(2345, i))
                    + " PLN.");
        }
        /** Challenge #3
         * Create a for statement using any range of number
         * Determine if the number is a prime number using the isPrime method
         * if it is a prime number, print it out AND increment a count of the
         * number of prime numbers found
         * if that count is 3 exit the for loop
         * hint: Use the break; statement to exit
         */

        System.out.println("\n***Challenge #3***\n");
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number.");
            } if (count == 3) {
                System.out.println("Exiting at count = " + count);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        int j;
        boolean isPrime;

        if (n > 1) {
            isPrime = true;
            for (j = 2; j <= (long) Math.sqrt(n); j++) {
                if ((n % j) == 0) isPrime = false;
            }
            if (isPrime) {
                return true;
            } else return false;
        } else return false;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
