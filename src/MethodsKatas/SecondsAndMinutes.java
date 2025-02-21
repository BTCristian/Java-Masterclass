package MethodsKatas;

public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println("getDurationString(86) = " + getDurationString(-3945));
        System.out.println("getDurationString(189, 4850) = " + getDurationString(-65, 45));
        System.out.println("getDurationString(189, 4850) = " + getDurationString(65, 145));
        System.out.println("getDurationString(189, 4850) = " + getDurationString(65, 45));
        System.out.println("getDurationString(86) = " + getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Seconds cannot be negative";
        }

        int minutes = seconds / 60;
        return getDurationString(seconds/ 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds ) {
        if (minutes < 0) {
            return "Minutes cannot be negative";
        }

        if (seconds < 0 || seconds > 59) {
        return "Invalid data for seconds! Seconds must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
