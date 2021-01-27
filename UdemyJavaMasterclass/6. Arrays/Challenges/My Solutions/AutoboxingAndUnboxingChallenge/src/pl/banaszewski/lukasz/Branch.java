package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;

    public Branch() {
        this.customers = new ArrayList<>();
    }

    public Customer addCustomer(String name, double initialTransactionAmount) {
        Customer newCustomer = new Customer(name);
        if(customerExists(newCustomer)) {
            System.out.println("\nCustomer with name " + newCustomer.getName() + " already exists.");
            return null;
        }
        newCustomer.addTransaction(initialTransactionAmount);
        this.customers.add(newCustomer);
        return newCustomer;
    }

    private int findCustomer(Customer customer) {
        String customerName = customer.getName();

        for(int i=0; i<this.customers.size(); i++) {
            if(this.customers.get(i).getName().equals(customerName)) {
                return this.customers.indexOf(this.customers.get(i));
            }
        }
        return -1;
    }

    private boolean customerExists(Customer customer) {
        int foundCustomer = findCustomer(customer);
        if(foundCustomer < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void showCustomers(boolean showWithTransactions) {
        System.out.println("\nList of customers registered in branch: \r");
        for(int i=0; i<this.customers.size(); i++) {
            System.out.print((i+1) + ". " + this.customers.get(i).getName());
            if(showWithTransactions) {
                System.out.print("'s transactions: ");
                for(int j=0; j<=this.customers.size(); j++) {
                    System.out.print(this.customers.get(i).getTransactions().get(j));
                    if (j < this.customers.size()) {
                        System.out.print(" ,");
                    } else {
                        System.out.print(".");
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
