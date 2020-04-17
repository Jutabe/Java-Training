package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65L, 45L));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41L));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long minutes, long seconds) {

        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h ";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String remainingMinutesString = remainingMinutes + "m ";
        if(remainingMinutes < 10) {
            remainingMinutesString = "0" + remainingMinutesString;
        }

        String secondsString = seconds + "s ";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + remainingMinutesString + secondsString;
    }

    private static String getDurationString(long seconds) {

        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
