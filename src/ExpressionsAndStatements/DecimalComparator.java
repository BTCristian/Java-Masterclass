package ExpressionsAndStatements;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces ( double firstDouble, double secondDouble) {

        int firstRounded = (int)(firstDouble * 1000);
        int secondRounded = (int)(secondDouble * 1000);


        return firstRounded == secondRounded;
    }
}
