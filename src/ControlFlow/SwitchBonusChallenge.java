package ControlFlow;

public class SwitchBonusChallenge {
    public static void main(String[] args) {

        System.out.println(printWeekDay(0));
        System.out.println(printWeekDay(1));
        System.out.println(printWeekDay(2));
        System.out.println(printWeekDay(3));
        System.out.println(printWeekDay(4));
        System.out.println(printWeekDay(5));
        System.out.println(printWeekDay(6));
        System.out.println(printWeekDay(7));
    }

    public static String printWeekDay(int day) {
        if (day < 0 || day > 6) {
            return "The input "
                    + day
                    + " is not supported as a day";
        }else if (day == 1){
            return "Sunday";
        }else if(day == 2){
            return "Monday";
        }else if(day == 3){
            return "Tuesday";
        }else if(day == 4){
            return "Wednesday";
        }else if(day == 5){
            return "Thursday";
        }else if(day == 6){
            return "Friday";
        }
        return "";
    }
}
