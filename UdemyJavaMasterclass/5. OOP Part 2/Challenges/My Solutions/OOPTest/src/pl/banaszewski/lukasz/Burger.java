package pl.banaszewski.lukasz;

public class Burger {

    private String name;
    private String breadRoll;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private double price = 5.50d;

    public Burger(String breadRoll, String meat) {
        this.name = "Burger";
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public void addAddition(String addition) {
        if(availableAdditions()){
            double additionPrice;

            switch(addition.toLowerCase()) {
                case "lettuce":


            }
        } else {
            System.out.println("No more additions available.");
        }

    }

    private boolean availableAdditions() {
        if(this.addition1 != null || this.addition2 != null || this.addition3 != null || this.addition4 != null) {
           return true;
        } else {
            return false;
        }
    }



}
