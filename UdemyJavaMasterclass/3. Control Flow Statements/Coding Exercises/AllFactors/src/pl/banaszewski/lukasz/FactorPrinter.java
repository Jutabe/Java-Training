package pl.banaszewski.lukasz;

public class FactorPrinter {

    public static void printFactors(int number) {

        if(number < 1) {
            System.out.println("Invalid Value");
        }

        String printMessage = "";
        for(int factor = 1; factor <= number; factor++) {
            if(number % factor == 0) {
                printMessage += factor + " ";
            }
        }

        System.out.println(printMessage);
    }
}
