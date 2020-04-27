package pl.banaszewski.lukasz;

public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i == 1) {
                    for (int j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                } else if (i == number) {
                    System.out.println();
                    for (int j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.println();
                    for (int j = 1; j <= number; j++) {
                        if (j == 1) {
                            System.out.print("*");
                        } else if (j == i || j == number - i + 1) {
                            System.out.print("*");
                        } else if (j == number) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}

