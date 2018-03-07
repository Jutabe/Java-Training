package com.banaszewski;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Credit-Suisse");


    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        boolean stayInMenu = true;
        int menuOption;

        while (stayInMenu) {
            printMainMenu();
            menuOption = scanner.nextInt();
            scanner.nextLine();
            switch (menuOption) {
                case 1:
                    addNewBranch();
                    break;
                case 2:
                    addCustomerAndTrans();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("\nThis is a simple bank application: \n"
                + "\t1. Add a new branch.\n "
                + "\t2. Add a customer to existing branch.\n "
                + "\t3. Add a transaction to existing customer.\n "
                + "\t4. Show the list of customers for particular branch.\n ");
        System.out.print("Choose menu option -> ");
    }

    public static void addNewBranch() {
        String name;
        System.out.print("Add new branch by typing its name -> ");
        name = scanner.nextLine();
        Branch newBranch = Branch.createBranch(name);
        if (bank.addNewBranch(newBranch)) {
            System.out.println("Branch " + name + " was added.");
        }
    }
}
