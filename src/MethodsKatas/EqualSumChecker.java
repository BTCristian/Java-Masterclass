package MethodsKatas;

public class EqualSumChecker {
    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber) {
        int sumOfFirstTwo = firstNumber + secondNumber;
        return thirdNumber == sumOfFirstTwo;
    }
}
