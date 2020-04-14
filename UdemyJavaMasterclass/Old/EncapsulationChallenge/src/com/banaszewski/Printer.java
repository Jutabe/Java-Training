package com.banaszewski;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplex = true;

    public Printer(int tonerLevel, int printedPages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.duplex = duplex;
    }

    public void fillToner(int ink) {
        this.tonerLevel = this.tonerLevel + ink;
        if (tonerLevel >= 100) {
            System.out.println("Printer cartridge is full. Ink left after refill: " + (tonerLevel - 100));
            this.tonerLevel = 100;
        }

        System.out.println("Current toner level is " + this.tonerLevel);
    }

    public void print(int pagesToPrint) {
        if (duplex && tonerLevel >= pagesToPrint) {
            System.out.println("Printing in duplex ");
            printedPages += pagesToPrint / 2;
            tonerLevel -= pagesToPrint;
        } else if(!duplex && tonerLevel >= pagesToPrint * 2){
            System.out.println("Printing without duplex");
            printedPages += pagesToPrint;
            tonerLevel -= pagesToPrint * 2;
        } else {
            System.out.println("Insufficient amount of ink. Please refill the ink!");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
