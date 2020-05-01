package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        /* Testing Vehicle Class */
        Vehicle boat = new Vehicle("Boat", false, false);

        System.out.println("### START TESTING VEHICLE ###");
        System.out.println("Details about the newly created vehicle." );
        System.out.println("This is a " + boat.getName() + " vehicle.");
        System.out.println("Is this " + boat.getName() + " a land Vehicle? => " + boat.isLandVehicle());
        System.out.println("Does this " + boat.getName() + " have wheels? => " + boat.hasWheels());

        System.out.println();

        System.out.println("Testing vehicle methods.");
        //Trying to act when does not move.
        boat.move(10);
        boat.steer("Left");
        boat.stop();

        //Let's move it
        boat.move();
        boat.steer("Left");
        boat.steer("Right");
        boat.steer("Dunno");
        boat.accelerate(30);
        boat.stop();

        System.out.println("### STOP TESTING VEHICLE ###");
        System.out.println();

        /* Testing Car Class */
        Car bmw = new Car("BMW", true, 190);

        System.out.println("### START TESTING CAR ###");
        System.out.println("Details about the newly created " + bmw.getBrand() + " car." );
        System.out.println("This " + bmw.getBrand() + " is a " + bmw.getName() + " vehicle.");
        System.out.println("Is this " + bmw.getBrand() + " a land Vehicle? => " + bmw.isLandVehicle());
        System.out.println("Does this " + bmw.getBrand() + " have wheels? => " + bmw.hasWheels());
        System.out.println("Does this " + bmw.getBrand() + " have an automatic gear box? => " + bmw.hasAutomaticGearBox());
        System.out.println("This " + bmw.getBrand() + " have " + bmw.getHorsePower() + " horse power.");

        System.out.println();

        System.out.println("Testing car methods.");
        //Trying to act when does not move.
        bmw.move(20);
        bmw.steer("Right");
        bmw.accelerate(10);
        bmw.stop();

        //Let's move it
        bmw.move();
        bmw.steer("Right");
        bmw.steer("Left");
        bmw.steer("I don't know what I am doing!");
        bmw.accelerate(300); // not enough power - should stop at proper max speed
        bmw.accelerate(50); // trying to accelerate even further
        bmw.stop();
        bmw.accelerate(40);
        bmw.stop();

        System.out.println("### STOP TESTING CAR ###");
        System.out.println();

        /* Testing Sports Car Class */
        SportsCar ferrari = new SportsCar("Ferrari", false, 600, true);

        System.out.println("### START TESTING SPORTS CAR ###");
        System.out.println("Details about the newly created " + ferrari.getBrand() + " car." );
        System.out.println("This " + ferrari.getBrand() + " is a " + ferrari.getName() + " vehicle.");
        System.out.println("Is this " + ferrari.getBrand() + " a land Vehicle? => " + ferrari.isLandVehicle());
        System.out.println("Does this " + ferrari.getBrand() + " have wheels? => " + ferrari.hasWheels());
        System.out.println("Does this " + ferrari.getBrand() + " have an automatic gear box? => " + ferrari.hasAutomaticGearBox());
        System.out.println("This " + ferrari.getBrand() + " have " + ferrari.getHorsePower() + " horse power.");

        System.out.println();

        System.out.println("Testing car methods.");
        //Trying to act when does not move//Trying to act when does not move.
        ferrari.move(50);
        ferrari.steer("Left");
        ferrari.stop();

        //Let's move it
        ferrari.move();
        ferrari.steer("Right");
        ferrari.steer("Left");
        ferrari.steer("Straight");
        ferrari.accelerate(500); // not enough power - should stop at proper max speed
        ferrari.accelerate(50); // trying to accelerate even further
        ferrari.stop();
        ferrari.accelerate(90);
        ferrari.stop();

        System.out.println("### STOP TESTING SPORTS CAR ###");
        System.out.println();
    }
}
