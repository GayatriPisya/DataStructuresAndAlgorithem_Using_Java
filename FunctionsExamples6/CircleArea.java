package FunctionsExamples6;

public class CircleArea {
    public static void main(String[] args) {
        double area = calculateArea(5.0);
        System.out.println("The area is: " + area);
    }

    public static double calculateArea(double radius) {
        return 3.14 * radius * radius; // Return the computed area
    }
}

