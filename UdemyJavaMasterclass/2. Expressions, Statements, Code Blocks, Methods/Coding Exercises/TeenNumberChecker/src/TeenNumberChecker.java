public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        boolean isFirstTeen = (firstNumber >= 13 && firstNumber <= 19) ? true : false;
        boolean isSecondTeen = (secondNumber >= 13 && secondNumber <= 19) ? true : false;
        boolean isThirdTeen = (thirdNumber >= 13 && thirdNumber <= 19) ? true : false;

        if(isFirstTeen || isSecondTeen || isThirdTeen) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int firstNumber) {
        boolean isFirstTeen = (firstNumber >= 13 && firstNumber <= 19) ? true : false;

        if(isFirstTeen) {
            return true;
        } else {
            return false;
        }
    }
}
