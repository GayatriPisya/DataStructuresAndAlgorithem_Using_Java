package ConditionalStatements4;

public class GradeTernary {
    public static void main(String[] args) {
        int marks = 85;

        String grade = (marks >= 90) ? "A" :
                       (marks >= 75) ? "B" :
                       (marks >= 50) ? "C" : "Fail";

        System.out.println("Your grade is " + grade);
    }
}
