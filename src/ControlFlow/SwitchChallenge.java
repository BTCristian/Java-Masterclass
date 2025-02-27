package ControlFlow;

public class SwitchChallenge {
    public static void main(String[] args) {

//        char charValue = 'X';
//        switch (charValue) {
//            case 'A':
//                System.out.println("A for Able");
//                break;
//            case 'B':
//                System.out.println("B for Baker");
//                break;
//            case 'C':
//                System.out.println("C for Charlie");
//                break;
//            case 'D':
//                System.out.println("D for Dog");
//                break;
//            case 'E':
//                System.out.println("E for Easy");
//                break;
//            default:
//                System.out.println("The letter " + charValue + " is not found in the switch");

        System.out.println(switchChallenge("D"));
        System.out.println(enhancedSwitchChallenge(0));
        System.out.println(enhancedSwitchChallenge(1));
        System.out.println(enhancedSwitchChallenge(2));
        System.out.println(enhancedSwitchChallenge(3));
        System.out.println(enhancedSwitchChallenge(4));
        System.out.println(enhancedSwitchChallenge(5));
        System.out.println(enhancedSwitchChallenge(6));
        System.out.println(enhancedSwitchChallenge(7));
    }

    public static String switchChallenge(String charVar) {
        switch (charVar) {
            case "A":
                return "The letter was: " + charVar + " for Able";
            case "B":
                return "The letter was: " + charVar + " for Baker";
            case "C":
                return "The letter was: " + charVar + " for Charlie";
            case "D":
                return "The letter was: " + charVar + " for Dog";
            case "E":
                return "The letter was: " + charVar + " for Easy";

        }
        return "not found";
    }

    public static String enhancedSwitchChallenge(int day) {
        return switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String badResponse = "The input "
                        + day
                        + " is not supported as a day";
                yield badResponse;
            }
        };
    }

}


