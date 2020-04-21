package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        printResult(12, 23);
        printResult(9, 99);
        printResult(15, 55);
        printResult(123,456);
        printResult(12, 13);
    }

    private static void printResult(int firstNumber, int secondNumber) {

        boolean result = SharedDigit.hasSharedDigit(firstNumber, secondNumber);

        if(result) {
            System.out.println(firstNumber + " and " + secondNumber + " share digits.");
        } else {
            System.out.println("Numbers do not share digits or number values are below 10 or greater than 99.");
        }
    }
}
