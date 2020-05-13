package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        Printer printerWithoutDuplex = new Printer(75, 25, false);
        printerWithoutDuplex.print(15);
        printerWithoutDuplex.printerStatus();
        printerWithoutDuplex.print(50);
        printerWithoutDuplex.fillToner(80);
        printerWithoutDuplex.printerStatus();
        printerWithoutDuplex.print(30);
        printerWithoutDuplex.addPagesToPrinter(5);
        printerWithoutDuplex.printerStatus();
        printerWithoutDuplex.print(30);

        System.out.println();

        Printer printerWithDuplex = new Printer(-1, 125, true);
        printerWithDuplex.print(15);
        printerWithDuplex.printerStatus();
        printerWithDuplex.addPagesToPrinter(5);
        printerWithDuplex.print(15);
        printerWithDuplex.printerStatus();
        printerWithDuplex.print(3);
        printerWithDuplex.printerStatus();
        printerWithDuplex.fillToner(20);
        printerWithDuplex.print(3);
        printerWithDuplex.printerStatus();



    }
}
