package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contactsList;

    public MobilePhone() {
        this.contactsList = new ArrayList<>();
    }

    public void showMenu() {
        System.out.println("\n Select option from mobile phone menu:");
        System.out.println("\t 0 - Show menu.");
        System.out.println("\t 1 - Print list of contacts.");
        System.out.println("\t 2 - Add new contact.");
        System.out.println("\t 3 - Update existing contact.");
        System.out.println("\t 4 - Remove contact.");
        System.out.println("\t 5 - Search contact.");
        System.out.println("\t 6 - Quit menu.\n");
    }

    public void printContacts() {
        if(contactsList.isEmpty()) {
            System.out.println("Contacts list is empty.");
        } else {
            System.out.println("Contacts list:");
            for(int i=0; i<contactsList.size(); i++) {
                System.out.println((i+1) + ". " + contactsList.get(i).getName() + " - " + contactsList.get(i).getPhoneNumber());
            }
        }
    }

    public void addNewContact(String name, String phoneNumber) {

    }
}

