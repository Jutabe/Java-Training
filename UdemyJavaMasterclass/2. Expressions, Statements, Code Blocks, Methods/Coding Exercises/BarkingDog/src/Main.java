public class Main {

    public static void main(String[] args) {

        boolean message;
        message = BarkingDog.shouldWakeUp(true, 1);
        System.out.println("1st " + message);
        message = BarkingDog.shouldWakeUp(false, 2);
        System.out.println("2nd " + message);
        message = BarkingDog.shouldWakeUp(true, 8);
        System.out.println("3rd " + message);
        message = BarkingDog.shouldWakeUp(true, -1);
        System.out.println("4th " + message);
    }
}
