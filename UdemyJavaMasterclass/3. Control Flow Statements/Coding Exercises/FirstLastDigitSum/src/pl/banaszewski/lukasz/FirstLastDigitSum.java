package pl.banaszewski.lukasz;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;

        if(number < 0) {
            return -1;
        }

        for(int i = 0; number > 0; i++) {
            int lastDigit = number % 10;
            number /= 10;

            if(i == 0 && number == 0) {
                sum += lastDigit * 2;
            } else if(i == 0 || number == 0) {
                sum += lastDigit;
            }
        }

        return sum;
    }
}
