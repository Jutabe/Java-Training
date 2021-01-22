package pl.banaszewski.lukasz;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {
        myPhone.showMenu();
        boolean stayInMenu = true;

        while(stayInMenu) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    myPhone.showMenu();
                    break;
                case 2:
                    myPhone.printContacts();
                    break;
                case 3:
                    System.out.println("Enter new contact name: ");
                    String newContactName = scanner.nextLine();
                    System.out.println("Enter new contact phone number: ");
                    String newContactPhoneNumber = scanner.nextLine();
                    myPhone.addNewContact(new Contacts(newContactName, newContactPhoneNumber));
                    break;
                case 4:
                    System.out.println("Enter contact name to update: ");
                    String contactToUpdate = scanner.nextLine();
                    if(myPhone.findContact(contactToUpdate) < 0) {
                        System.out.println("Contact not found. Nothing to update.");
                        break;
                    }
                    System.out.println("Enter updated name: ");
                    String contactUpdatedName = scanner.nextLine();
                    System.out.println("Enter updated phone number: ");
                    String contactUpdatedPhoneNumber = scanner.nextLine();
                    myPhone.updateContact(contactToUpdate, contactUpdatedName, contactUpdatedPhoneNumber);
                    break;
                case 5:
                    System.out.println("Enter the name of the contact to remove: ");
                    String contactToRemove = scanner.nextLine();
                    if(myPhone.findContact(contactToRemove) < 0) {
                        System.out.println("Contact not found. Nothing to remove.");
                        break;
                    }
                    myPhone.removeContact(contactToRemove);
                    System.out.println("Contact removed.");
                    break;
                case 6:
                    System.out.println("Enter the name of the contact to find: ");
                    String contactToFind = scanner.nextLine();
                    boolean contactExist = myPhone.findContact(contactToFind) >= 0;
                    if(contactExist) {
                        System.out.println("Contact found.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                default:
                    System.out.println("User quits mobile phone menu.");
                    stayInMenu = false;
                    break;
            }
        }
    }
}