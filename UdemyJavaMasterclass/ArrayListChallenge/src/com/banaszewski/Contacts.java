package com.banaszewski;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;

    private ArrayList<String> contactsArrayList = new ArrayList<>();

    public int addContact(String item) {
        String lowerCaseItem = item.toLowerCase();
        if (checkIfExists(lowerCaseItem)) {
            System.out.println("\nContact \'" + contactsArrayList.get(getLowerCaseArray().indexOf(lowerCaseItem)) + "\' is already on the list.");
            System.out.println("Contact " + lowerCaseItem + " was not added!");
            return 0;
        } else {
            contactsArrayList.add(item);
            return 1;
        }
    }

    public void printContactList() {
        System.out.println("\nMy current contact list: ");
        for (int i = 0; i < contactsArrayList.size() / 2; i++) {
            System.out.print(i + 1 + ". ");
            System.out.format("%-10s | %10s", contactsArrayList.get(i * 2), contactsArrayList.get(i * 2 + 1));
            System.out.println();
        }
    }

    public void searchContact(String name) {
        String lowerCaseName = name.toLowerCase();
        if (checkIfExists(lowerCaseName)) {
            System.out.println("Contact \'" + contactsArrayList.get(getLowerCaseArray().indexOf(lowerCaseName)) + "\' is placed on the " + (getLowerCaseArray().indexOf(lowerCaseName)-1)*2 + " position on the list.");
        } else {
            System.out.println("Cannot find contact of name \'" + lowerCaseName + "\'");
        }

    }

    public int updateContactName(String name, String newName) {
        String lowerCaseName = name.toLowerCase();
        String lowerCaseNewName = newName.toLowerCase();
        if (!checkIfExists(name)) {
            System.out.println("Could not find \'" + contactsArrayList.get(getLowerCaseArray().indexOf(lowerCaseName)) + "\' name in current list.");
            return 0;
        } else if (checkIfExists(newName)) {
            System.out.println("Contact \'" + contactsArrayList.get(getLowerCaseArray().indexOf(lowerCaseNewName)) + "\' already exists.");
            return 0;
        } else{
            contactsArrayList.set(getLowerCaseArray().indexOf(lowerCaseName), newName);
            return 1;
        }
    }

    public int updateContactPhone(String phone, String newPhone) {
        String lowerCasePhone = phone.toLowerCase();
        String lowerCaseNewPhone = newPhone.toLowerCase();
        if (!checkIfExists(phone)) {
            System.out.println("Could not find \'" + contactsArrayList.get(getLowerCaseArray().indexOf(lowerCasePhone)) + "\' phone number in current list.");
            return 0;
        } else if (checkIfExists(newPhone)) {
            System.out.println("Phone number \'" + contactsArrayList.get(getLowerCaseArray().indexOf(lowerCaseNewPhone)) + "\' already exists.");
            return 0;
        } else{
            contactsArrayList.set(getLowerCaseArray().indexOf(lowerCasePhone), newPhone);
            return 1;
        }
    }

    public int removeContact(int number) {
        if (number < 0 | number > contactsArrayList.size()/2) {
            return 1;
        } else {
            contactsArrayList.remove((number-1)*2);
            contactsArrayList.remove((number-1)*2);
            return 0;
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
        if (getLowerCaseArray().contains(lowerCaseName)) {
            return true;
        } else return false;
    }


}
