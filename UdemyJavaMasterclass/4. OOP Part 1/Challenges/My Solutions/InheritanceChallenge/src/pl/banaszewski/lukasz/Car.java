package pl.banaszewski.lukasz;

public class Car extends Vehicle {

    private String brand;
    private boolean hasAutomaticGearBox;
    private int horsePower = 70;
    private int currentGear;

    public Car() {
        super("Car", true, true);
        this.brand = "Toyota";
        this.hasAutomaticGearBox = false;
        this.currentGear = 0;
    }

    public Car(String brand, boolean hasAutomaticGearBox, int horsePower) {
        super("Car", true, true);
        this.brand = brand;
        this.hasAutomaticGearBox = hasAutomaticGearBox;
        this.horsePower = horsePower;
        this.currentGear = 0;
    }

    public void changeGear() {
        int currentSpeed = getCurrentSpeed();
        int speedModifierForGear = 12;

        if (hasAutomaticGearBox) {
            speedModifierForGear = 10;
        }

        if (currentSpeed > 0 && currentSpeed < 20) {
            currentGear = 1;
        } else if (currentSpeed >= 2 * speedModifierForGear && currentSpeed < 4 * speedModifierForGear) {
            currentGear = 2;
        } else if (currentSpeed >= 4 * speedModifierForGear && currentSpeed < 6 * speedModifierForGear) {
            currentGear = 3;
        } else if (currentSpeed >= 6 * speedModifierForGear && currentSpeed < 8 * speedModifierForGear) {
            currentGear = 4;
        } else if (currentSpeed >= 8 * speedModifierForGear && currentSpeed < 10 * speedModifierForGear) {
            currentGear = 5;
        } else if (currentSpeed >= 10 * speedModifierForGear && currentSpeed < 13 * speedModifierForGear) {
            currentGear = 6;
        } else if (currentSpeed >= 13 * speedModifierForGear && currentSpeed < 16 * speedModifierForGear) {
            currentGear = 7;
        } else if (currentSpeed >= 16 * speedModifierForGear) {
            currentGear = 8;
        } else {
            currentGear = 0;
        }

        System.out.println("Current gear is " + currentGear);
    }

    @Override
    public void accelerate(int speed) {
        if (getCurrentSpeed() > 0) {
            int maxSpeed = (int) (horsePower * 1.15);
            int maxAcceleration = maxSpeed - getCurrentSpeed();
            if (speed > 0 && maxAcceleration > 0) {
                System.out.println("Accelerating the Car by " + speed);
                while (speed > 0 || getCurrentSpeed() > 0) {
                    int acceleration = ((int) (horsePower / 100)) * 8;
                    move(getCurrentSpeed() + acceleration);
                    changeGear();
                    speed -= acceleration;

                    if (maxSpeed < getCurrentSpeed()) {
                        System.out.println("Maximum Car speed reached at " + getCurrentSpeed() + " km/h.");
                        break;
                    }
                }
            } else {
                move(getCurrentSpeed());
            }
        }
    }

    public String getBrand() {
        return brand;
    }

    public boolean hasAutomaticGearBox() {
        return hasAutomaticGearBox;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
