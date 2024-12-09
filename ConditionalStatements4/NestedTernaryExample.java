package ConditionalStatements4;

public class NestedTernaryExample {
    public static void main(String[] args) {
        int number = 0;
        // int number = 5;
        // int number = -8;

        String result = (number > 0) ? "Positive" : 
                        (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is " + result);
    }
}
