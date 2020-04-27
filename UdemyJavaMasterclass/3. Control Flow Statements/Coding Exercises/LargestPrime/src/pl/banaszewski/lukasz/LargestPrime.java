package pl.banaszewski.lukasz;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int largestPrimeNumber = 2;

        for(int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= (long) Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime && (number % i == 0)) {
                largestPrimeNumber = i;
            }

        }

        return largestPrimeNumber;
    }
}
