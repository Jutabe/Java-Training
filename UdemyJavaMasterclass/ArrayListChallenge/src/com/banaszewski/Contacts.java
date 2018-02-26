package com.banaszewski;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;

    private ArrayList<String> contactsArrayList = new ArrayList<>();

    public void addNewContact(String name) {
        contactsArrayList.add(name);
    }
}
