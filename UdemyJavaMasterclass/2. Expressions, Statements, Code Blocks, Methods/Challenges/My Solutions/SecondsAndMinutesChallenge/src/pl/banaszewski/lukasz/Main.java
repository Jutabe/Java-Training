package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        // Challenge content can be found in README.md
        System.out.println("getDurationString(int minutes, int seconds)");
        getDurationString(119, 50);
        getDurationString(51, 21);
        getDurationString(0, 59);
        getDurationString(256, 1);
        getDurationString(11, 0);
        System.out.println();
        System.out.println("getDurationString(int seconds)");
        getDurationString(3600);
        getDurationString(123);
        getDurationString(0);
        getDurationString(9999);
    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }

        int fullTimeInSeconds = seconds + minutes * 60;
        int calcHours = fullTimeInSeconds / 3600;
        int calcSeconds = fullTimeInSeconds % 3600;
        int calcMinutes = calcSeconds / 60;
        calcSeconds = calcSeconds % 60;

        String stringHours = String.valueOf(calcHours);
        String stringMinutes = String.valueOf(calcMinutes);
        String stringSeconds = String.valueOf(calcSeconds);

        if(calcHours >= 0 && calcHours < 10) {
            stringHours = "0" + stringHours;
        }

        if(calcMinutes >= 0 && calcMinutes < 10) {
            stringMinutes = "0" + stringMinutes;
        }

        if(calcSeconds >= 0 && calcSeconds < 10) {
            stringSeconds = "0" + stringSeconds;
        }

        String durationString = stringHours + "h " + stringMinutes + "m " + stringSeconds + "s";

        System.out.println(durationString);
        return durationString;
    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
