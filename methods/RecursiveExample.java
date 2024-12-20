package methods;
//A recursive method calls itself to solve a smaller problem.
public class RecursiveExample {
    public static int factorial(int n) {
        if (n == 0) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
