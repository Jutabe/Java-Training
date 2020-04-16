public class Main {

    public static void main(String[] args) {
        //Should be not leap years
        printMessage(1700);
        printMessage(1800);
        printMessage(1900);
        printMessage(2100);
        printMessage(2200);
        printMessage(2300);
        printMessage(2500);
        printMessage(2600);

        //Should be leap years
        printMessage(1600);
        printMessage(2000);
        printMessage(2400);

        //Example input/outputs from exercise content
        printMessage(-1600);
        printMessage(1600);
        printMessage(2017);
        printMessage(2000);
    }

    public static void printMessage(int year) {

        if(year < 1 || year > 9999) {
            System.out.println("Wrong year provided");
        } else if(LeapYear.isLeapYear(year)) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
    }
}
