package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        printResult(-1221);
        printResult(707);
        printResult(11212);

    }

    private static void printResult(int number) {
        if(NumberPalindrome.isPalindrome(number)) {
            System.out.println("Number " + number + " is a palindrome");
        } else {
            System.out.println("Number " + number + " is not a palindrome");
        }
    }
}
