//If you do not include a break statement, the program will continue executing all cases after the matched case.
package ConditionalStatements4;
public class SwitchFallThroughExample {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Weekend");
        }
    }
}
