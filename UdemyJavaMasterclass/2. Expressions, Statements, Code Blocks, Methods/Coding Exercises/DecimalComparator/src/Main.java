public class Main {

    public static void main(String[] args) {
        printMessage(-3.1756, -3.175);
        printMessage(3.175, 3.176);
        printMessage(3.0, 3.0);
        printMessage(-3.123, 3.123);
    }

    public static void printMessage(double firstNumber, double secondNumber) {

        if(DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber)) {
            System.out.println(firstNumber + " and " + secondNumber + " are equal by three decimal places.");
        } else {
            System.out.println(firstNumber + " and " + secondNumber + " are not equal by three decimal places.");
        }
    }
}
