package methods;
//These belong to the class and can be called without creating an object.
public class StaticExample {
    public static void main(String[] args) {
        displayMessage();
    }

    public static void displayMessage() {
        System.out.println("This is a static method.");
    }
}
