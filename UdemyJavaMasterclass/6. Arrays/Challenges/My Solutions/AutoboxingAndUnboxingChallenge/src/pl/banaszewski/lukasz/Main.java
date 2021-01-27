package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        Branch branch1 = bank1.addBranch();
        Customer lukasz = branch1.addCustomer("Lukasz Banaszewski", 2299.90d);
        lukasz.addTransaction(150.80d);
        lukasz.addTransaction(89.95d);
        branch1.showCustomers(false);
        Customer tim = branch1.addCustomer("Tim Buchalka", 120.05d);
        tim.addTransaction(99.99d);
        tim.addTransaction(13.13d);
        tim.addTransaction(255.01d);
        branch1.showCustomers(true);
        Customer lukasz2 = branch1.addCustomer("Lukasz Banaszewski", 1234.123d);



    }
}
