package com.banaszewski;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactsArrayList = new Contacts();

    public static void main(String[] args) throws Exception {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
        boolean stayInMenu = true;
        int menuOption;

        while (stayInMenu) {
            clearScreen();
            printContactMenu();
            System.out.print("\nChoose option -> ");
            menuOption = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (menuOption) {
                case 1:
                    printContactList();
                    waitForButton();
                    break;
                case 2:
                    searchContactByName();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    System.out.println("Exiting contact list");
                    stayInMenu = false;
                    break;
                default:
                    System.out.println("Wrong menu option");
                    break;

            }
        }
    }

    public static void printContactMenu() {
        System.out.println("\nMy mobile phone contact list menu:");
        System.out.println("\t1. Print list of contacts.");
        System.out.println("\t2. Search contact by name.");
        System.out.println("\t3. Add new contact.");
        System.out.println("\t4. Update existing contact.");
        System.out.println("\t5. Remove contact.");
        System.out.println("\t6. Exit mobile phone contact list.");
    }

    public static void printContactList() {
        contactsArrayList.printContactList();
    }

    public static void addNewContact() throws Exception {
        System.out.println("Add new contact: ");
        System.out.print("Enter name -> ");
        String keyboardInput = scanner.nextLine();
        if (contactsArrayList.addContact(keyboardInput) == 1) {
            System.out.print("Enter phone number: ");
            contactsArrayList.addContact(scanner.nextLine());
            System.out.println("Adding contact to the list");
        }
        loaderBar();
    }

    public static void searchContactByName() throws Exception {
        System.out.println("Search contact by name: ");
        System.out.print("Enter name -> ");
        contactsArrayList.searchContact(scanner.nextLine());
        loaderBar();
    }

    public static void updateContact() throws Exception {
        boolean stayInMenu = true;
        int listOption;
        String existingItem;
        String updatedItem;

        submenu:
        {
            clearScreen();
            System.out.println("Select the item to update? ");
            System.out.println("\t1. Name.");
            System.out.println("\t2. Phone number.");
            System.out.println("\t3. Go back.");

            while (stayInMenu) {
                System.out.print("\nChoose option -> ");
                listOption = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                switch (listOption) {
                    case 1:
                        printContactList();
                        System.out.println("Enter the name of contact to update -> ");
                        existingItem = scanner.nextLine();
                        System.out.println("Enter new name -> ");
                        updatedItem = scanner.nextLine();
                        if (contactsArrayList.updateContactName(existingItem, updatedItem) == 0) {
                            loaderBar();
                            break submenu;
                        } else {
                            System.out.println("Updating contact name \'" + existingItem + "\' to \'" + updatedItem + "\'.");
                            loaderBar();
                            stayInMenu = false;
                            break;
                        }
                    case 2:
                        printContactList();
                        System.out.println("Enter the number of contact to update -> ");
                        existingItem = scanner.nextLine();
                        System.out.println("Enter new name -> ");
                        updatedItem = scanner.nextLine();
                        if (contactsArrayList.updateContactPhone(existingItem, updatedItem) == 0) {
                            loaderBar();
                            break submenu;
                        } else {
                            System.out.println("Updating contact number \'" + existingItem + "\' to \'" + updatedItem + "\'.");
                            loaderBar();
                            stayInMenu = false;
                            break;
                        }
                    case 3:
                        System.out.println("Going back to main menu");
                        loaderBar();
                        stayInMenu = false;
                        break;
                    default:
                        System.out.print("Wrong number. Try again.");
                        loaderBar();
                        break;
                }
            }
        }
    }

    public static void removeContact() throws Exception {
        boolean stayInMenu = true;

        System.out.println("Remove contact from list: ");
        printContactList();
        System.out.println("Pick a number from the list to remove the contact and its number -> ");
        while(stayInMenu) {
            if (contactsArrayList.removeContact(scanner.nextInt()) == 1) {
                System.out.println("Wrong number picked from the list.");
                System.out.print("Try again -> ");
            } else {
                System.out.println("Removing contact from the list");
                stayInMenu = false;
                loaderBar();
            }
        }
    }

    public static void clearScreen() throws Exception, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void loaderBar() throws Exception {
        System.out.print("[");
        for (int i = 0; i <= 30; i++) {
            Thread.sleep(50);
            System.out.print("*");
        }
        System.out.print("]\n");
    }

    public static void waitForButton() {
        System.out.println("\nPress any button to continue...");
        scanner.nextLine();
    }

}
