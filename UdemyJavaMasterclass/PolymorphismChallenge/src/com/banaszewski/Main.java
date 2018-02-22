package com.banaszewski;

class Car {
    private String name;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine() {
        return "The Car starts the engine.";
    }

    public String accelerate() {
        return  "The Car accelerates+++";
    }

    public String brake() {
        return "The Car brakes---";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Porsche extends Car {
    public Porsche() {
        super("Porsche", 6);
    }

    public String startEngine() {
        return "The " + getName() + " engine starts...";
    }

    public String accelerate() {
        return "The " + getName() + " accelerates+++";
    }

    public String brake() {
        return "The " + getName() + " brakes";
    }
}

class BMW extends Car {
    public BMW() {
        super("BMW", 8);
    }

    @Override
    public String startEngine() {
        return "The " + getName() + " engine starts...";
    }

    @Override
    public String accelerate() {
        return "The " + getName() + " accelerates+++";
    }

    @Override
    public String brake() {
        return "The " + getName() + " brakes";
    }
}

class Fiat extends Car {
    public Fiat() {
        super("Fiat", 4);
    }

    @Override
    public String startEngine() {
        return "The " + getName() + " engine starts...";
    }

    @Override
    public String accelerate() {
        return "The " + getName() + " accelerates+++";
    }

    @Override
    public String brake() {
        return "The " + getName() + " brakes";
    }
}

class OldCar extends Car {
    public OldCar() {
        super("Old Car", 2);
    }

    // No startEngine, accelerate, brake methods here...
}

public class Main {

    public static void main(String[] args) {
        /*
        We are going to go back to the car analogy
        Create a base class called Car
        It should have a few fields that would be appropriate for a generic car class.
        engine, cylinders, wheels, etc.
        Constructor should initialize cylinders (number of) and name, and set wheels to 4
        and engine to true. Cylinders and names would be passed parameters.

        Create appropriate getters

        Create some methods like startEngine, accelerate, and brake

        show a message for each in the base class
        Now create 3 sub classes for your favorite vehicles.
        Override the appropriate methods to demonstrate polymorphism in use.
        put all classes in the one java file (this one).
         */

        for(int i = 1; i<11; i++) {
            Car car = randomCars();
            System.out.println("Vehicle #" + i + " was created.\n" +
                                "It is a " + car.getName() + " with a " + car.getCylinders() + " cylinders engine" +
                                ".\n" + car.startEngine() +
                                ".\n" + car.accelerate() +
                                ".\n" + car.brake() + ".");
            System.out.println();
        }
    }

    public static Car randomCars() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber) {
            case 1:
                return new Porsche();
            case 2:
                return new BMW();
            case 3:
                return new Fiat();
            case 4:
                return new OldCar();
        }
        return null;
    }
}
