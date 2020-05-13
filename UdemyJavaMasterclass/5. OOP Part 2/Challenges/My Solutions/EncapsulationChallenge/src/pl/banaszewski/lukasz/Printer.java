package pl.banaszewski.lukasz;

public class Printer {

    private int tonerLevel = 50;
    private int numberOfPages = 10;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        if(numberOfPages >= 0 && numberOfPages <= 30) {
            this.numberOfPages = numberOfPages;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount) {
        int amountAfterRefill = this.tonerLevel + amount;

        if(amountAfterRefill >= 0 && amountAfterRefill <= 100) {
            this.tonerLevel = amountAfterRefill;
        } else if(amountAfterRefill > 100) {
            this.tonerLevel = 100;
        }
    }

    public void addPagesToPrinter(int pages) {
        int amountOfPagesAfterAddition = this.numberOfPages + pages;

        if(amountOfPagesAfterAddition >= 0 && amountOfPagesAfterAddition <= 30) {
            this.numberOfPages = amountOfPagesAfterAddition;
        } else if(amountOfPagesAfterAddition > 30) {
            this.numberOfPages = 30;
        }
    }

    public void print(int pages) {
        int requiredInk = pages * 3;

        if(this.tonerLevel - requiredInk < 0) {
            System.out.println("Insufficient ink. Please refill the toner.");
        } else if(this.numberOfPages - pages < 0) {
            System.out.println("No blank pages left. Please add extra pages to the printer.");
        } else {
            if(this.isDuplex) {
                pages = (int) Math.ceil((double) pages / 2);
            }

            this.tonerLevel = this.tonerLevel - requiredInk;
            this.numberOfPages = this.numberOfPages - pages;

            System.out.println("Printed " + pages + " pages.");
        }
    }

    public void printerStatus() {
        System.out.println("Ink remaining " + getTonerLevel());
        System.out.println("Paper remaining " + getNumberOfPages());
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
