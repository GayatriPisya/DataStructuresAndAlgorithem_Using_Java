package ConditionalStatements4;

public class NestedIfNumberCheck {
    public static void main(String[] args) {
        int number = 45;

        if (number >= 1 && number <= 100) { // Outer condition
            if (number % 5 == 0) { // Inner condition
                System.out.println("The number is within the range and divisible by 5.");
            } else {
                System.out.println("The number is within the range but not divisible by 5.");
            }
        } else {
            System.out.println("The number is out of range.");
        }
    }
}
