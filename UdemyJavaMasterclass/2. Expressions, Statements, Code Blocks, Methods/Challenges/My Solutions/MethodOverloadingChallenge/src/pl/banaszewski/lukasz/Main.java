package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

	    // Challenge content can be found in README.md
        System.out.println(calcFeetAndInchesToCentimeters(2, 11));
        System.out.println(calcFeetAndInchesToCentimeters(23, 2));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 5));
        System.out.println(calcFeetAndInchesToCentimeters(4, 13));
        System.out.println(calcFeetAndInchesToCentimeters(-6, 23));

        System.out.println(calcFeetAndInchesToCentimeters(99));
        System.out.println(calcFeetAndInchesToCentimeters(13));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
        System.out.println(calcFeetAndInchesToCentimeters(0));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if(feet >= 0 && inches >= 0) {
            if(feet > 0 && inches > 12) {
                return -1;
            } else {
                double feetInInches = feet * 12 * 2.54;
                double resultInCentimeters = feetInInches + inches * 2.54;
                return resultInCentimeters;
            }
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        if(inches < 0) {
            return -1;
        } else {
            return calcFeetAndInchesToCentimeters(0, inches);
        }
    }
}
