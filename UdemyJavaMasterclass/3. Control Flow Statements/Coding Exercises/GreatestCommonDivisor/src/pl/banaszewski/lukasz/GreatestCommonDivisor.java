package pl.banaszewski.lukasz;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestCommonDivisor = 0;

        for (int i = first / 2; i >= 1; i--) {
            System.out.println("count " + i);
            if (first % i == 0) {
                if (second % i == 0) {
                    greatestCommonDivisor = i;
                    break;
                }
            }
        }

        return greatestCommonDivisor;
    }
}
