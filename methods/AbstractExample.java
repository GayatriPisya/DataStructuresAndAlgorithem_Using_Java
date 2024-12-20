package methods;
//Abstract methods have no implementation and are meant to be overridden in a subclass.
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
