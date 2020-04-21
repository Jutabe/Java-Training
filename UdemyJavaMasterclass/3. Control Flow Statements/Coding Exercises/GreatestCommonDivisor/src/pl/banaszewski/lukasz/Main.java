package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        printResult(25, 15);
        printResult(12, 30);
        printResult(9, 18);
        printResult(81, 153);
    }


    private static void printResult(int first, int second) {
        int greatestCommonDivisor = GreatestCommonDivisor.getGreatestCommonDivisor(first, second);
        if (greatestCommonDivisor > -1) {
            System.out.println(first + " and " + second + " have a greatest common divisor = " + greatestCommonDivisor);
        } else {
            System.out.println(first +  " and " + second + " does not have a greatest common divisor.");
        }
    }
}

