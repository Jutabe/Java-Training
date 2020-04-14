package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteVar = 123;
        short myShortVar = 12345;
        int myIntVar = 1234567;
        long myLongVar = 50000 + 10 * (myByteVar + myShortVar + myIntVar);
        System.out.println("My Long Variable is now " + myLongVar);
    }
}
