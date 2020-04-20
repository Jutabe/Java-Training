package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        //While loop - if the while condition is not met it will never execute (eg. count == 6)
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //Identical to the while loop above
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

        //Infinite loop - break after condition is met
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        //This will not execute because initial i declaration is less than loop range
//        for(int i=6; i!=6; i++) {
//            System.out.println("Count value is " + count);
//        }

        count = 1;

        //Do / While loop - if the while condition is not met the loop will execute at least once
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        //Challenge 1:
//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        // Challenge 2:
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        //Challenge 2:
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    // Challenge 1:
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
