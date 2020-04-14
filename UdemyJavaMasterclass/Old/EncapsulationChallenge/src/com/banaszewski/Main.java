package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        /*
        Create a class and demonstrate proper encapsulation techniques
        the class will be called Printer
        It will simulate a real Computer Printer
        It should have fields for the toner Level, number of pages printed, and
        also whether its a duplex printer (capable of printing on both sides of the paper).
        Add methods to fill up the toner (up to maximum of 100%), another method to
        simulate printing a page (which should increase the number of pages printed).
        Decide on the scope, whether to use constructors, and anything else you this is needed.
         */

        Printer printer = new Printer(80, 100, false);
        Printer printer2 = new Printer(35, 0, true);

        //Printing without duplex
        printer.fillToner(10);
        printer.fillToner(30);
        printer.print(20);
        System.out.println("Toner level for printer 1 is: " + printer.getTonerLevel());
        System.out.println("Pages printed for printer 1 is: " + printer.getPrintedPages());

        //Printing without sufficient amount of ink
        printer2.print(40);
        printer2.fillToner(25);

        //Printing duplex after refill
        printer2.print(40);
        System.out.println("Toner level for printer 2 is: " + printer2.getTonerLevel());
        System.out.println("Pages printed for printer 2 is: " + printer2.getPrintedPages());


    }
}
