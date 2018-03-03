package com.banaszewski;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;

    private ArrayList<String> contactsArrayList = new ArrayList<>();

    public int addContact(String item) {
        if (checkIfExists(item)) {
            System.out.println("Contact \'" + contactsArrayList.get(getLowerCaseArray().indexOf(item)) + "\' is already on the list.");
            System.out.println("Contact " + item + " was not added!");
            return 0;
        } else {
            contactsArrayList.add(item);
            return 1;
        }
    }

    public void printContactList() {
        System.out.println("My current contact list: ");
        for (int i = 0; i < contactsArrayList.size() / 2; i++) {
            System.out.print(i + 1 + ". " + contactsArrayList.get(i * 2) + " | " + contactsArrayList.get(i * 2 + 1) + "\n");
        }
    }

    public void searchContact(String name) {
        if (checkIfExists(name)) {
            System.out.println("Contact \'" + contactsArrayList.get(getLowerCaseArray().indexOf(name)) + "\' has been found on the list.");
        } else {
            System.out.println("Cannot find contact of name \'" + name + "\'");
        }

    }

    public int updateContactName(String name, String newName) {
        if(checkIfExists(newName)) {
            System.out.println("Contact \'" + contactsArrayList.get(getLowerCaseArray().indexOf(newName)) + "\' already exists.");
            System.out.println("Choose another name");
            return 0;
        } else {
            contactsArrayList.set(getLowerCaseArray().indexOf(name), newName);
            return 1;
        }


    }

    private ArrayList<String> getLowerCaseArray() {
        ArrayList<String> temp = new ArrayList<>();
        temp.addAll(contactsArrayList);
        for (int i = 0; i < temp.size(); i++) {
            temp.set(i, temp.get(i).toLowerCase());
        }
        return temp;
    }

    private boolean checkIfExists(String name) {
        String lowerCaseName = name.toLowerCase();
        if(getLowerCaseArray().contains(lowerCaseName)) {
            return true;
        } else return false;
    }


}
