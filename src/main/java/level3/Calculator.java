package level3;

public class Calculator {
    public static int addition(int number1, int number2) {
        return (number1 + number2);
    }
    public static int subtraction(int number1, int number2) {
        return (number1 - number2);
    }
    public static int multiplication(int number1, int number2) {
        return (number1 * number2);
    }
    public static int division(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("It is not possible to divide by zero.");
        }
        return (number1 / number2);
    }
    public static int restDivision(int number1, int number2) {
        return (number1 % number2);
    }
    public static double pow(double number1, double number2) {
        return (Math.pow(number1, number2));
    }
    public static boolean isEven(int n) {
        return ((n % 2 ) == 0);
    }
    public static boolean isOdd(int n) {
        return ((n % 2 ) != 0);
    }
}
