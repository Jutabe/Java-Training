package com.banaszewski;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(Branch branch) {
        if(findBranch(branch.getName())) {
            System.out.println("Branch " + branch.getName() + " already exists.");
            return false;
        }
        branches.add(branch);
        return true;
    }

    public boolean addNewCustomer(Customer customer, Branch branch) {
        if(!findBranch(branch.getName())) {
            System.out.println("Branch " + branch.getName() + " does not exist.");
            return false;
        } else if(findCustomer())
        return true;
    }

    private boolean findBranch(String name) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch loopBranch = this.branches.get(i);
            if(loopBranch.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean findCustomer(Customer customer) {
        for(int i=0; i<this.cu)
    }
}
