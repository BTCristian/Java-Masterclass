import MethodsKatas.BarkingDog;
import MethodsKatas.MegaBytesConverter;
import MethodsKatas.PositiveNegativeZero;
import MethodsKatas.SpeedConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java MasterClass - Katas");

        //MethodsKatas.PositiveNegativeZero
        PositiveNegativeZero.checkNumber(10);
        PositiveNegativeZero.checkNumber(-5);
        PositiveNegativeZero.checkNumber(0);


        //MethodsKatas.SpeedConverter
        System.out.println(
                "10 Km/h = " + SpeedConverter.toMilesPerHour(10)
                + " mi/h");


        //MethodsKatas.MegaBytesConverter
        MegaBytesConverter.printMegaBytesAndKiloBytes(1879);

        System.out.println(BarkingDog.shouldWakeUp(true, 19));
        System.out.println(BarkingDog.shouldWakeUp(true, 2));
    }
}
