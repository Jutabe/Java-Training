package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;

    public Branch() {
        this.customers = new ArrayList<>();
    }

    public Customer addCustomer(String name, double initialTransactionAmount) {
        Customer newCustomer = new Customer(name);
        newCustomer.addTransaction(initialTransactionAmount);
        this.customers.add(newCustomer);
        return newCustomer;
    }

    public void showCustomers(boolean showWithTransactions) {
        System.out.println("List of customers registered in branch: \r");
        for(int i=0; i<=this.customers.size(); i++) {
            System.out.print((i+1) + ". " + this.customers.get(i).getName());
            if(showWithTransactions) {
                System.out.println("'s transactions: ");
                for(int j=0; j<=this.customers.size(); j++) {
                    System.out.print(this.customers.get(i).getTransactions().get(j));
                    if(j < this.customers.size()) {
                        System.out.print(" ,");
                    } else {
                        System.out.println(".");
                    }
                }
            }
            System.out.println();
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
