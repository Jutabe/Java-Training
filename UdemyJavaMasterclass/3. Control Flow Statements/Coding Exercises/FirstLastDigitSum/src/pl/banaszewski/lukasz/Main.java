package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        printResult(252);
        printResult(257);
        printResult(0);
        printResult(5);
        printResult(-10);
    }

    private static void printResult(int number) {

        int sum = FirstLastDigitSum.sumFirstAndLastDigit(number);
        if(sum > -1) {
            System.out.println("Sum of the first and last digit in number " + number + " = " + sum);
        } else {
            System.out.println("Number must be a positive whole number");
        }
    }
}
