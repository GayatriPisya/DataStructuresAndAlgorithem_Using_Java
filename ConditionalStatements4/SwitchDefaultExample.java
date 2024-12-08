package ConditionalStatements4;

public class SwitchDefaultExample {
    public static void main(String[] args) {
        int number = 7;

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not a valid number");
        }
    }
    
}
