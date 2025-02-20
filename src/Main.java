public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java MasterClass Methods Katas");

        PositiveNegativeZero.checkNumber(10);
        PositiveNegativeZero.checkNumber(-5);
        PositiveNegativeZero.checkNumber(0);


        System.out.println(
                "10 Km/h = " + SpeedConverter.toMilesPerHour(10)
                + " mi/h");
    }
}
