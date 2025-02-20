import MethodsKatas.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java MasterClass - Katas");

        //PositiveNegativeZero
        PositiveNegativeZero.checkNumber(10);
        PositiveNegativeZero.checkNumber(-5);
        PositiveNegativeZero.checkNumber(0);


        //SpeedConverter
        System.out.println(
                "'toMilesPerHour(10)' km/h = " + SpeedConverter.toMilesPerHour(10)
                + " mi/h");


        //MegaBytesConverter
        MegaBytesConverter.printMegaBytesAndKiloBytes(1879);

        System.out.println(BarkingDog.shouldWakeUp(true, 19));
        System.out.println(BarkingDog.shouldWakeUp(true, 2));

        //LeapYear
        System.out.println("isLeapYear(-1600) " + LeapYear.isLeapYear(-1600));
        System.out.println("isLeapYear(1924) " + LeapYear.isLeapYear(1924));
        System.out.println("isLeapYear(2000) " + LeapYear.isLeapYear(2000));
        System.out.println("isLeapYear(2017) " + LeapYear.isLeapYear(2017));

        //DecimalComparator
        System.out.println("areEqualByThreeDecimalPlaces(-3.1756, -3.175)  "
                + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println("areEqualByThreeDecimalPlaces(3.175, 3.176)  "
                + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));

        System.out.println("areEqualByThreeDecimalPlaces(3.0, 3.0)  "
                + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("areEqualByThreeDecimalPlaces(-3.123, 3.123)  "
                + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        //EqualSumChecker
        System.out.println("hasEqualSum(1, 1, 1)  = "
                + EqualSumChecker.hasEqualSum(1,1,1));

        System.out.println("hasEqualSum(1, 1, 2)  = "
                + EqualSumChecker.hasEqualSum(1,1,2));

        System.out.println("hasEqualSum(1, -1, 0)  = "
                + EqualSumChecker.hasEqualSum(1,-1,0));

        //TeenNumberChecker
        System.out.println("hasTeen(9, 99, 19) "
                + TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println("isTeen(9) "
                + TeenNumberChecker.isTeen(9));
    }
}
