package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if(!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }

        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;
        int thirdNumberLastDigit = thirdNumber % 10;

        if(firstNumberLastDigit == secondNumberLastDigit || firstNumberLastDigit == thirdNumberLastDigit || secondNumberLastDigit == thirdNumberLastDigit) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
