package ExpressionsAndStatements;

public class OverloadedMethodChallenge {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

        System.out.println("AreaCalculator(5.0) = " + AreaCalculator.area(5.0));
        System.out.println("AreaCalculator(5.0) = " + AreaCalculator.area(-1));
        System.out.println("AreaCalculator(4, 5) = " + AreaCalculator.area(4, 5));

        System.out.println("MinutesToYearsDaysCalculator.printYearsAndDays(525600):  " + MinutesToYearsDaysCalculator.printYearsAndDays(525600));


        System.out.print("IntEqualityPrinter.printEqual(1,1,1) => ");IntEqualityPrinter.printEqual(1,1,1);
        System.out.print("IntEqualityPrinter.printEqual(2,2,3) => ");IntEqualityPrinter.printEqual(2,2,3);
        System.out.print("IntEqualityPrinter.printEqual(-1,2,3) => ");IntEqualityPrinter.printEqual(-1,2,3);
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches ) {

//        return convertToCentimeters((feet * 12) + inches);

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;

        return convertToCentimeters(totalInches);
    }

    //AreaCalculator
    public static class AreaCalculator {

        public static double area (double radius) {
            if (radius < 0){
                return -1.0;
            }
            return radius * radius * 3.141592653589793;
        }

        public static double area (double x, double y){
            if (x < 0 || y < 0){
                return -1.0;
            }
            return x * y;
        }
    }

    //MinutesToYearsDaysCalculator
    public static class MinutesToYearsDaysCalculator {
        public static String printYearsAndDays (long minutes) {

            if (minutes < 0) {
                return "Invalid Value";
            }else {
                long year = minutes / 525600;
                long remainingMinutes = minutes % 525600;
                long days = remainingMinutes / 1440;

                return(minutes + " min = " + year + " y and " + days +" d");
            }



        }
    }


    //IntEqualityPrinter

    public static class IntEqualityPrinter {

        public static void printEqual (int firstVar, int secondVar, int thirdVar) {


            if (firstVar < 0 || secondVar < 0 || thirdVar < 0) {
                System.out.println("Invalid Value");
            }else if (firstVar == secondVar && secondVar == thirdVar) {
                System.out.println("All numbers are equal");
            }else if (firstVar != secondVar && secondVar != thirdVar && firstVar != thirdVar) {
                System.out.println("All numbers are different");
            } else{
                System.out.println("Neither all are equal or different");
            }


        }
    }

}
