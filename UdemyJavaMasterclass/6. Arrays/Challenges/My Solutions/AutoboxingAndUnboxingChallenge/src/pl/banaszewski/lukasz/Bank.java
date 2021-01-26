package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public Branch addBranch() {
        Branch newBranch = new Branch();
        this.branches.add(newBranch);
        return newBranch;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
