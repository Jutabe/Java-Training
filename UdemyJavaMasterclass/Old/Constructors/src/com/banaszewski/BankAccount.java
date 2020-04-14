package com.banaszewski;

public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // Declaring constructors
    public BankAccount() {
        this(12344, 234.01, "Nowak", "tralal@wp.pl", 1234509);
        System.out.println("Empty constructor called!");
    }

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber) {
        System.out.println("Account with parameters called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(12342, 102.31, customerName,email, phoneNumber);
    }

    public void setAccountNumber(int number) {
        this.number = number;
    }

    public int getAccountNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double moneyAmountToDeposit) {
       this.balance += moneyAmountToDeposit;
       System.out.println("Deposited " + moneyAmountToDeposit);
    }

    public void withdrawFunds(double moneyAmountToWithdraw) {
        if(this.balance < moneyAmountToWithdraw) {
            System.out.println("Insufficient balance. Please withdraw less funds");
        } else {
            this.balance -= moneyAmountToWithdraw;
            System.out.println("Withdrawn " + moneyAmountToWithdraw);
        }
    }
}
