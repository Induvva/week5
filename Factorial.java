import java.util.Scanner;

public class Factorial {

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Main function
    public static void main(String[] args) {
        factorial(5);

    }
}