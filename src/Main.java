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
                "10 Km/h = " + SpeedConverter.toMilesPerHour(10)
                + " mi/h");


        //MegaBytesConverter
        MegaBytesConverter.printMegaBytesAndKiloBytes(1879);

        System.out.println(BarkingDog.shouldWakeUp(true, 19));
        System.out.println(BarkingDog.shouldWakeUp(true, 2));

        //LeapYear
        System.out.println("Is -1600 leap year? = " + LeapYear.isLeapYear(-1600));
        System.out.println("Is 1924 leap year? = " + LeapYear.isLeapYear(1924));
        System.out.println("Is 2000 leap year? = " + LeapYear.isLeapYear(2000));
        System.out.println("Is 2017 leap year? = " + LeapYear.isLeapYear(2017));

        //DecimalComparator
        System.out.println("Is '-3.1756' equal up to 3 decimals with '-3.175'?  Answer: "
                + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println("Is '3.175' equal up to 3 decimals with '3.176'?  Answer: "
                + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));

        System.out.println("Is '3.0' equal up to 3 decimals with '3.0'?  Answer: "
                + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("Is '-3.123' equal up to 3 decimals with '3.123'?  Answer: "
                + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
