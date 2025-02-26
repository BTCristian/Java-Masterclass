package ControlFlow;

public class SwitchChallenge {
    public static void main(String[] args) {

        System.out.println(switchChallenge("D"));

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

        } return "not found";
    }
}
