public class Main {

    public static void main(String[] args) {

        //Checking hasTeen method
        printMessage(9, 99, 19);
        printMessage(23, 15, 42);
        printMessage(22, 23, 34);

        //Checking isTeen method
        printMessage(9);
        printMessage(13);
    }

    public static void printMessage(int firstNumber) {

        if(TeenNumberChecker.isTeen(firstNumber)) {
            System.out.println("Person at age of " + firstNumber + " is a teen!");
        } else {
            System.out.println("Person at age of " + firstNumber + " is not a teen!");
        }
    }

    public static void printMessage(int firstNumber, int secondNumber, int thirdNumber) {

        if(TeenNumberChecker.hasTeen(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("Group of people at respective age of " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " have at least one teen.");
        } else {
            System.out.println("Group of people at respective age of " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " have no one who is a teen.");
        }
    }
}
