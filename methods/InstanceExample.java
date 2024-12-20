package methods;
//These methods operate on an instance of a class.
public class InstanceExample {
    public void displayMessage() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        InstanceExample example = new InstanceExample();
        example.displayMessage();
    }
}
