package com.banaszewski;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("Default", 500000, "Default@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "support@bank.com");
    }

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
