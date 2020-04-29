package pl.banaszewski.lukasz;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int balance) {
        this.balance += balance;
        System.out.println("Deposited " + balance);
        System.out.println("Current balance is " + this.balance);
    }

    public void withdrawFunds(int balance) {
        if(balance > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= balance;
            System.out.println("Withdrew " + balance);
            System.out.println("Current balance is " + this.balance);
        }
    }
}
