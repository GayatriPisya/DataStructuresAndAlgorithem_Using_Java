package ConditionalStatements4;

public class NestedIfGradingSystem {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 50) { // Outer condition: Pass or Fail
            if (marks >= 90) { // Grade A
                System.out.println("You passed with Grade A.");
            } else if (marks >= 75) { // Grade B
                System.out.println("You passed with Grade B.");
            } else { // Grade C
                System.out.println("You passed with Grade C.");
            }
        } else {
            System.out.println("You failed.");
        }
    }
}
