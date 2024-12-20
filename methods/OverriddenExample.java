package methods;
//When a subclass provides its own implementation of a method from its parent class.
class Parent {
    public void show() {
        System.out.println("Parent's show method.");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child's show method.");
    }
}

public class OverriddenExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Calls Child's method
    }
}
