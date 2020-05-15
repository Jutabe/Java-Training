package pl.banaszewski.lukasz;

public class Additions {

    private String lettuceName = "Lettuce";
    private String tomatoName = "Tomato";
    private String carrotName = "Carrot";
    private String cheeseName = "Cheese";
    private String onionName = "Onion";
    private String beckonName = "Beckon";
    private double lettucePrice = 0.35d;
    private double tomatoPrice = 0.25d;
    private double carrotPrice = 0.1d;
    private double cheesePrice = 0.5d;
    private double onionPrice = 0.15d;
    private double beckonPrice = 0.9d;

    public void printAdditionsList() {
        System.out.println("# Additions list #");
        System.out.println("1. " + lettuceName + " = " + lettucePrice);
        System.out.println("2. " + tomatoName + " = " + tomatoPrice);
        System.out.println("3. " + carrotName + " = " + carrotPrice);
        System.out.println("4. " + cheeseName + " = " + cheesePrice);
        System.out.println("5. " + onionName + " = " + onionPrice);
        System.out.println("6. " + beckonName + " = " + beckonPrice);
    }

    public String getLettuceName() {
        return lettuceName;
    }

    public String getTomatoName() {
        return tomatoName;
    }

    public String getCarrotName() {
        return carrotName;
    }

    public String getCheeseName() {
        return cheeseName;
    }

    public String getOnionName() {
        return onionName;
    }

    public String getBeckonName() {
        return beckonName;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }

    public double getBeckonPrice() {
        return beckonPrice;
    }
}
