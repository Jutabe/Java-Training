package pl.banaszewski.lukasz;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if(firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
            return false;
        }

        while(firstNumber > 0) {
            int firstNumberLastDigit = firstNumber % 10;
            int calcSecondNumber = secondNumber;
            firstNumber /= 10;

            while(calcSecondNumber > 0) {
                int secondNumberLastDigit = calcSecondNumber % 10;
                calcSecondNumber /= 10;

                if(firstNumberLastDigit == secondNumberLastDigit) {
                    return true;
                }
            }
        }

        return false;
    }
}
