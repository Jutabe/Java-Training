package pl.banaszewski.lukasz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while(counter <= 10) {
            System.out.println("Enter number #" + counter + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int userNumber = scanner.nextInt();
                sum += userNumber;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Sum of user input numbers = " + sum);
    }
}
