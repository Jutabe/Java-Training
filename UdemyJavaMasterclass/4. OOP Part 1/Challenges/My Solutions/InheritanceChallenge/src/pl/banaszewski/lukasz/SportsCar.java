package pl.banaszewski.lukasz;

public class SportsCar extends Car {

    private boolean hasTurboBoost;

    public SportsCar(String brand, boolean hasAutomaticGearBox, int horsePower, boolean hasTurboBoost) {
        super(brand, hasAutomaticGearBox, horsePower);
        this.hasTurboBoost = hasTurboBoost;
    }

    @Override
    public void accelerate(int speed) {
        if (getCurrentSpeed() > 0) {
            if (hasTurboBoost) {
                int sportsCarHorsePower = getHorsePower();
                int maxSpeed = (int) (sportsCarHorsePower / 2);
                setHorsePower(maxSpeed + 30);
                System.out.println("Accelerating with Turbo Boost!");
                super.accelerate(speed);
                setHorsePower(sportsCarHorsePower);
            } else {
                super.accelerate(speed);
            }
        }
    }
}
