package ConditionalStatements4;

public class NestedIfVotingEligibilityExample {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) { // Outer condition
            if (isCitizen) { // Inner condition
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must be a citizen to vote.");
            }
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }
    
}
