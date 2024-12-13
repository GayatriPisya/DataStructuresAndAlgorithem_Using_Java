package RecursionExamples7;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
}
