package methods;
//Final methods cannot be overridden in subclasses.
class Parent {
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // This will cause an error
    // public void displayMessage() {}
}

public class FinalExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.displayMessage();
    }
}
