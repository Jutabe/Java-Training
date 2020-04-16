public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        double firstNumberRoundedToThreeDecimalPlaces = (((double) ((int) (firstNumber * 1000))) / 1000);
        double secondNumberRoundedToThreeDecimalPlaces = (((double) ((int) (secondNumber * 1000))) / 1000);

        if(firstNumberRoundedToThreeDecimalPlaces == secondNumberRoundedToThreeDecimalPlaces) {
            return true;
        } else {
            return false;
        }
    }
}
