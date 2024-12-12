package FunctionsExamples6;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 20)); // Calls the first add
        System.out.println(add(10.5, 20.5)); // Calls the second add
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
