package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        System.out.println("Solution 1#");
        printDayOfTheWeek(-2);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(13);

        System.out.println();

        System.out.println("Solution 2#");
        printDayOfTheWeek2(-2);
        printDayOfTheWeek2(1);
        printDayOfTheWeek2(2);
        printDayOfTheWeek2(3);
        printDayOfTheWeek2(4);
        printDayOfTheWeek2(5);
        printDayOfTheWeek2(6);
        printDayOfTheWeek2(7);
        printDayOfTheWeek2(13);
    }

    private static void printDayOfTheWeek(int day) {

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void printDayOfTheWeek2(int day) {

        if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else if(day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
