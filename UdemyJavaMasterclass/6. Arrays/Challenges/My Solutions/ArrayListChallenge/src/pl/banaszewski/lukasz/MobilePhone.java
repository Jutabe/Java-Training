package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contactsList;

    public MobilePhone() {
        this.contactsList = new ArrayList<>();
    }

    public void showMenu() {
        System.out.println("\n Select option from mobile phone menu:");
        System.out.println("\t 1 - Show menu.");
        System.out.println("\t 2 - Print list of contacts.");
        System.out.println("\t 3 - Add new contact.");
        System.out.println("\t 4 - Update existing contact.");
        System.out.println("\t 5 - Remove contact.");
        System.out.println("\t 6 - Search contact.");
        System.out.println("\t 7 - Quit menu.\n");
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

    public void addNewContact(Contacts contact) {
        boolean contactAlreadyExists = (findContact(contact.getName()) >= 0);

        if(contactAlreadyExists) {
            System.out.println("Contact already exists.");
        } else {
            contactsList.add(contact);
            System.out.println("New contact was added.");
        }
    }

    public void updateContact(String oldName, String newName, String newPhoneNumber) {
        addNewContact(new Contacts(newName, newPhoneNumber));
        removeContact(oldName);
    }

    public void removeContact(String name) {
        int contactIndex = findContact(name);

        if(contactIndex < 0) {
            System.out.println("Contact does not exist.");
        } else {
            contactsList.remove(contactIndex);
        }
    }

    public int findContact(String name) {
        boolean contactExists = false;
        int index = 0;
        for(int i=0; i<contactsList.size(); i++) {
            if(contactsList.get(i).getName().contains(name)) {
                contactExists = true;
                index = i;
            }
        }

        if(contactExists) {
            return index;
        }

        return -1;
    }
}