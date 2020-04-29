package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

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



    }
}
