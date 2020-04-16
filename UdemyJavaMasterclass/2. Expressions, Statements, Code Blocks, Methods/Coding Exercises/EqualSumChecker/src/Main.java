public class Main {

    public static void main(String[] args) {
       printMessage(1, 1, 1);
       printMessage(1, 1, 2);
       printMessage(1, -1, 0);
    }

    public static void printMessage(int firstParameter, int secondParameter, int thirdParameter) {

        if(EqualSumChecker.hasEqualSum(firstParameter, secondParameter, thirdParameter)) {
            System.out.println(firstParameter + " + " + secondParameter + " == " + thirdParameter);
        } else {
            System.out.println(firstParameter + " + " + secondParameter + " != " + thirdParameter);
        }
    }
}
