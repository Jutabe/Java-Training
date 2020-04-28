package pl.banaszewski.lukasz;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int numberOfValues = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                numberOfValues++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        avg = Math.round((double) sum / numberOfValues);

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
