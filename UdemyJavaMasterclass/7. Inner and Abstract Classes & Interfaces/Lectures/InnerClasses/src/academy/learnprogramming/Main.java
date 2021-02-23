package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        /* Example of Inner Class - Before we made the Gear class private
        *   Gearbox mcLaren = new Gearbox(6);
        *   Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//          Gearbox.Gear second = new Gearbox.Gear(2, 15.4); <- this will not work
//          Gearbox.Gear third = new mcLaren.Gear(3, 17.8); <- this will not work
            System.out.println(first.driveSpeed(1000));
        * */

        /* Example of Inner Class - After we made the Gear class private
            Gearbox mcLaren = new Gearbox(6);
            mcLaren.operateClutch(true);
            mcLaren.changeGear(1);
            mcLaren.operateClutch(false);
            System.out.println(mcLaren.wheelSpeed(1000));
            mcLaren.changeGear(2);
            System.out.println(mcLaren.wheelSpeed(3000));
            mcLaren.operateClutch(true);
            mcLaren.changeGear(3);
            mcLaren.operateClutch(false);
            System.out.println(mcLaren.wheelSpeed(6000));
        */

        /* Example of using a Local Class
            class ClickListener implements Button.OnClickListener {
                public ClickListener() {
                    System.out.println("I've been attached");
                }

                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked");
                }
            }

            btnPrint.setOnClickListener(new ClickListener());
            listen();
        */

        // Example of using an Anonymous Class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
