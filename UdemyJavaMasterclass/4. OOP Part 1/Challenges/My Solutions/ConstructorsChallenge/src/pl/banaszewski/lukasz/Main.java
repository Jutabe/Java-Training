package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        // My Challenge Solution Part 1:
        BankAccount johnDoeBankAccount = new BankAccount();
        johnDoeBankAccount.setCustomerName("John Doe");
        johnDoeBankAccount.setAccountNumber(1234567891011121314L);
        johnDoeBankAccount.setEmail("john@doe.com");
        johnDoeBankAccount.setPhoneNumber("+48 123 987 123");
        johnDoeBankAccount.setBalance(1234.56);

        System.out.println("Welcome " + johnDoeBankAccount.getCustomerName() + "!");
        System.out.println("You new bank account was registered with number " + johnDoeBankAccount.getAccountNumber());
        System.out.println("In case of any queries we will contact you using your email " + johnDoeBankAccount.getEmail());
        System.out.println("In special cases we will contact you using your phone " + johnDoeBankAccount.getPhoneNumber());
        System.out.println("Your current balance is " + johnDoeBankAccount.getBalance());
        System.out.println();
        System.out.println("I would like to withdraw 5000");

        johnDoeBankAccount.withdrawFunds(5000);
        System.out.println();
        System.out.println("Ups sorry about that! Then I will deposit 2500");
        johnDoeBankAccount.depositFunds(2500);
        System.out.println();
        System.out.println("On second thought, I need 500 for today's party");
        johnDoeBankAccount.withdrawFunds(500);
        System.out.println();

        // My Challenge Solution Part 2:
        VipCustomer jamesBondVipCustomer = new VipCustomer();

        System.out.println("Welcome Mr. " + jamesBondVipCustomer.getName());
        System.out.println("You are a VipCustomer in our Bank and your credit limit is " + jamesBondVipCustomer.getCreditLimit());
        System.out.println("We have send you a secret token on your email " + jamesBondVipCustomer.getEmailAddress());
        System.out.println();

        VipCustomer maryJaneVipCustomer = new VipCustomer("Mary Jane", 1000.0d);

        System.out.println("Welcome Mrs. " + maryJaneVipCustomer.getName());
        System.out.println("You are a VipCustomer in our Bank and your credit limit is " + maryJaneVipCustomer.getCreditLimit());
        System.out.println("We have send you a secret token on your email " + maryJaneVipCustomer.getEmailAddress());
        System.out.println();

        VipCustomer newVipCustomer = new VipCustomer("Steve Jobs", 1, "steve.jobs@apple.com");

        System.out.println("Welcome Mr. " + newVipCustomer.getName());
        System.out.println("You are a VipCustomer in our Bank and your credit limit is " + newVipCustomer.getCreditLimit());
        System.out.println("We have send you a secret token on your email " + newVipCustomer.getEmailAddress());


    }
}
