package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        printResult(123456789);
        printResult(252);
        printResult(-22);
    }

    private static void printResult(int number) {
        int sum = EvenDigitSum.getEvenDigitSum(number);
        if(sum > -1) {
            System.out.println("Even Digit Sum for number " + number + " = " + sum);
        } else {
            System.out.println("Must be a positive whole number or 0");
        }
    }
}
