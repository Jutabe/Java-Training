package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(123456));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(-13));
        System.out.println(sumDigits(968938123));
    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sumDigits = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number /= 10;
        }

        return sumDigits;

    }
}
