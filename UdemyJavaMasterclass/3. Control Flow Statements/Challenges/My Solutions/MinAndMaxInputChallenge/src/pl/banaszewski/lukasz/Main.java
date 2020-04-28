package pl.banaszewski.lukasz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Enter number:");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                if (min == 0 && max == 0) {
                    min = number;
                    max = number;
                } else if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
        }

        System.out.println("Minimum number was " + min);
        System.out.println("Maximum number was " + max);

        scanner.close();

    }
}
