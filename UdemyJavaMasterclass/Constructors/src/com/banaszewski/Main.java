package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        /** Challenge #1:
         * Create a new class for a bank account
         * Create fields for the account number, balance, customer name,
         * email, phone number.
         *
         * Create getters and setters for each field
         * Create two additional methods
         * 1. To allow the customer to deposit funds (this should
         * increment the balance field).
         * 2. To allow the customer to withdraw funds. This should deduct
         * from the balance field, but not allow to withdrawal to complete
         * if their are insufficent funds.
         * You will want to create various code in the Main.class
         * (the once created by Intellij) to confirm your code is working.
         * Add some System.out.println's in the two methods above as well.
         */
        System.out.println("\n***Challenge #1***\n");

//        BankAccount CS = new BankAccount();
//        CS.setBalance(12098.31);
//        System.out.println(CS.getBalance());
//        CS.depositFunds(101.69);
//        System.out.println(CS.getBalance());
//        CS.withdrawFunds(2200);
//        System.out.println(CS.getBalance());
//        CS.withdrawFunds(10001);
//        System.out.println(CS.getBalance());

        // Using constructors
        BankAccount myAcc = new BankAccount(1111, 100, "Banaszewski", "abc@wp.pl", 123456789 );
        System.out.println(myAcc.getCustomerName());
        System.out.println(myAcc.getAccountNumber());
        System.out.println(myAcc.getBalance());

        BankAccount newAcc = new BankAccount();
        System.out.println(newAcc.getCustomerName());

        BankAccount timsAccount = new BankAccount("Kowalski", "wp@wp.pl", 10293847);
        System.out.println(timsAccount.getCustomerName());
        System.out.println(timsAccount.getBalance());

        /** Challenge #2:
         * Create a new class VipCustomer
         * it should have 3 fields: name, credit limit, and email address
         * create 3 constructors
         * 1st constructor empty should call the constructor with 3 parameters with default values
         * 2nd constructor should pass on the 2 values it receives and add a default for the 3rd
         * 3rd constructor should save all fields.
         * create getters only for this using code generation of intellij as setters wont be needed
         * test and confirm it works
         */
        System.out.println("\n***Challenge #2***\n");

        VipCustomer LukaszVip = new VipCustomer();
        System.out.println("Name: " + LukaszVip.getCustomerName()
                            + " Credit Limit: " + LukaszVip.getCreditLimit()
                            + " Email: " + LukaszVip.getCustomerEmail());

        VipCustomer JustynaVip = new VipCustomer("JustynaVip", 100.00);

        System.out.println("Name: " + JustynaVip.getCustomerName()
                + " Credit Limit: " + JustynaVip.getCreditLimit()
                + " Email: " + JustynaVip.getCustomerEmail());

        VipCustomer OlgierdVip = new VipCustomer("OlgierdVip", 2018, "baby@born.com");

        System.out.println("Name: " + OlgierdVip.getCustomerName()
                + " Credit Limit: " + OlgierdVip.getCreditLimit()
                + " Email: " + OlgierdVip.getCustomerEmail());
    }
}
