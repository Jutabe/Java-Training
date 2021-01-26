package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        Branch branch1 = bank1.addBranch();
        Customer lukasz = branch1.addCustomer("Lukasz Banaszewski", 2299.90d);
        lukasz.addTransaction(150.80d);
        lukasz.addTransaction(89.95d);
        branch1.showCustomers(false);

    }
}
