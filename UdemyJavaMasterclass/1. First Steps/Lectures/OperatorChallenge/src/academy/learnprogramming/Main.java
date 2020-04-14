package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double firstVar = 20.00;
        double secondVar = 80.00;
        double thirdVar = (firstVar + secondVar) * 100;
        double fourthVar = thirdVar % 40.00;
        System.out.println("firstVar = " + firstVar);
        System.out.println("secondVar = " + secondVar);
        System.out.println("thirdVar = " + thirdVar);
        System.out.println("fourthVar = " + fourthVar);

        boolean booleanVar = (fourthVar == 0) ? true : false;
        System.out.println("bolleanVar = " + booleanVar);

        if(!booleanVar) {
            System.out.println("Got some remainder!");
        }
    }
}
