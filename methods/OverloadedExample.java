package methods;
//Multiple methods with the same name but different parameter lists.
public class OverloadedExample {
    public void displayMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void displayMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + message);
        }
    }

    public static void main(String[] args) {
        OverloadedExample example = new OverloadedExample();
        example.displayMessage("Hello!");
        example.displayMessage("Hello!", 3);
    }
}
