package pl.banaszewski.lukasz;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        boolean stayInMenu = true;

        while(stayInMenu) {
            myPhone.showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 0:
                    myPhone.showMenu();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    //addNewContact();
                    break;
                case 3:
                    //updateContact();
                    break;
                case 4:
                    //removeContact();
                    break;
                case 5:
                    //searchContact();
                    break;
                default:
                    System.out.println("User quits mobile phone menu.");
                    stayInMenu = false;
                    break;
            }
        }
    }
}
