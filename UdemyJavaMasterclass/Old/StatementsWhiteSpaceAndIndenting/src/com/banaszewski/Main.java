package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // the complete line is a STATEMENT
        myVariable++; // the complete line is a STATEMENT
        myVariable--; // the complete lin is a STATEMENT
        System.out.println("This is a test"); // the complete line is a STATEMENT

        // Line 12, 13, 14 presents ONE STATEMENT
        System.out.println("This is"
                            + "another " +
                            "still more.");

        // THREE STATEMENTS in one line (not recomemnded)
        int anotherVariable = 50; myVariable--;System.out.println("This is another one");

        // This statement will also work
        int                 myVariable2
                =50
                ;

        
    }
}
