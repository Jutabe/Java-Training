package pl.banaszewski.lukasz;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class BMW extends Car {
    public BMW() {
        super("BMW", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("BMW is braking.");
    }
}

class Porsche extends Car {
    public Porsche() {
        super("Porsche", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Porsche is braking.");
    }
}

class Kia extends Car {
    public Kia() {
        super("Kia", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Kia engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Kia is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Kia is braking.");
    }
}

class Wreck extends Car {
    public Wreck() {
        super("Wreck", 2);
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("##### " + i + " #####");
            Car car = pickARandomCar();
            System.out.println("Picked a " + car.getName() + ".");
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println("##########");
            System.out.println();
        }

    }

    public static Car pickARandomCar() {
        int random = (int) (Math.random() * 4) + 1;
        switch (random) {
            case 1:
                return new BMW();
            case 2:
                return new Porsche();
            case 3:
                return new Kia();
            case 4:
                return new Wreck();
        }

        return new Car("Unknown", 0);
    }
}
