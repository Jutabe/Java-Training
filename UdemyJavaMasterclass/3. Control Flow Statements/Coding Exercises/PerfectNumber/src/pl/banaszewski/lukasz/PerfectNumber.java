package pl.banaszewski.lukasz;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if(number < 1) {
            return false;
        }

        int sum = 0;
        for(int factor = 1; factor < number; factor++) {
            if(number % factor == 0) {
                sum += factor;
            }
        }

        if(number == sum) {
            return true;
        } else {
            return false;
        }
    }
}
