package pl.banaszewski.lukasz;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverseNumber = 0;
        int initNumber = Math.abs(number);
        number = Math.abs(number);

        while(number > 0) {
           int lastDigit = number % 10;
           number /= 10;
           reverseNumber = (reverseNumber * 10) + lastDigit;
        }

        if(initNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }

    }
}
