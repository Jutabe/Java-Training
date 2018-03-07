package com.banaszewski;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;



    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addNewBranch(Branch branch) {
        if (findBranch(branch.getName())) {
            System.out.println("Branch " + branch.getName() + " already exists.");
            return false;
        }
        branches.add(branch);
        return true;
    }

    public boolean addNewCustomer(Branch branch, Customer customer) {
        if (!findBranch(branch.getName())) {
            System.out.println("Branch " + branch.getName() + " does not exist.");
            return false;
        } else if (findCustomer(customer.getName())) {
            System.out.println("Customer " + customer.getName() + " was already added to this branch.");
            return false;
        }
        customers.add(customer);
        return true;
    }

    private boolean findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch loopBranch = this.branches.get(i);
            if (loopBranch.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer loopBranch = this.customers.get(i);
            if (loopBranch.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printBank() {
        System.out.println("Bank name printed " + getName());
        System.out.print("Branches printed: ");
        for (int i = 0; i < getBranches().size(); i++) {
            System.out.print(getBranches().get(i).getName() + ", ");
        }
    }
}
