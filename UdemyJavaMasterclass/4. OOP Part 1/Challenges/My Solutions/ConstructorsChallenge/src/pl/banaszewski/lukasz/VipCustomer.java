package pl.banaszewski.lukasz;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
       this("James Bond", 1000000.0d, "james.bond@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "no-reply@email.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
