package pl.banaszewski.lukasz;

public class Vehicle {

    private String name;
    private boolean isLandVehicle;
    private boolean hasWheels;
    private int currentSpeed = -1;

    public Vehicle(String name, boolean isLandVehicle, boolean hasWheels) {
        this.name = name;
        this.isLandVehicle = isLandVehicle;
        this.hasWheels = hasWheels;
    }

    public void move() {
        setCurrentSpeed(1);
        System.out.println("Vehicle started.");
    }

    public int move(int speed) {
        if (currentSpeed <= 0) {
            System.out.println("Vehicle is not moving.");
            return -1;
        } else {
            System.out.println("Vehicle is moving at " + speed + " km/h.");
            setCurrentSpeed(speed);
            return speed;
        }
    }

    public void accelerate(int speed) {
        if (getCurrentSpeed() > 0) {
            int maxSpeed = 50;
            int maxAcceleration = maxSpeed - getCurrentSpeed();
            if (speed > 0 && maxAcceleration > 0) {
                System.out.println("Accelerating the Vehicle by " + speed);
                while (speed > 0) {
                    int acceleration = 10;
                    move(getCurrentSpeed() + acceleration);
                    speed -= acceleration;

                    if (maxSpeed < getCurrentSpeed()) {
                        System.out.println("Maximum Vehicle speed reached at " + getCurrentSpeed() + " km/h.");
                        break;
                    }
                }
            }
        }
    }

    public void stop() {
        if(currentSpeed > 0) {
            setCurrentSpeed(0);
            System.out.println("Vehicle stopped.");
        }
    }


    public void steer(String direction) {
        if (currentSpeed > 0) {
            if (direction.equals("Left")) {
                System.out.println("Vehicle is steering left.");
            } else if (direction.equals("Right")) {
                System.out.println("Vehicle is steering right.");
            } else {
                System.out.println("Vehicle is moving straight.");
            }
        } else {
            move(currentSpeed);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isLandVehicle() {
        return isLandVehicle;
    }

    public boolean hasWheels() {
        return hasWheels;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    private void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }
}
