package VariableExamples;
//Class Variables (Static Variables): Declared with the static keyword and shared by all instances of the class.
public class staticvariable {
    static int count = 0; // Static variable shared by all instances
    
    public staticvariable() {
        count++; // Increment count for every object created
    }

    public static void main(String[] args) {
        new staticvariable();
        new staticvariable();
        System.out.println("Count: " + count); 
    }
}
